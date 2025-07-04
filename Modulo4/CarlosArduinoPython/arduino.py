from ast import JoinedStr
from cgitb import text
from csv import excel_tab
import imp
from sunau import Au_read
from pyfirmata import Arduino
import pyttsx3
import speech_recognition as sr
import time

arduino = Arduino('COM8')

ledQuarto = arduino.digital[3]
ledSala = arduino.digital[6]
ledCozinha = arduino.digital[9]

time.sleep(1)

jorge = pyttsx3.init()

def falar(texto):
    jorge.say(texto)
    jorge.runAndWait()


def ouvir():
    interprete = sr.Recognizer()
    with sr.Microphone() as mc:
        print("ouvindo...")
        audio = interprete.listen(mc)
        try:
            texto = interprete.recogmize_google(audio, 'pt-BR')
            print(f"voce falou isso: {texto}")
            return texto
        except sr.UnknownValueError:
            print("Fale corretamente, nao entendi")
            return ""
        except sr.RequestError:
            print("erro na bomba do serviço de reconhecimento")
            return ""

while True:
    comando = ouvir()
    comando.lower()
    if 'ligar quarto' in comando:
        falar("ligando a luz do quarto!")
        ledQuarto.Write(1)