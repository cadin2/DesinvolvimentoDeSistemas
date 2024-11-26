riachuelo = set(('camisola','calça jeans','tenis','edredom','boné'))
casasNordestinas = set(('topioca','tenis','baião de 2','edredom','acarajé'))

exclusivo = riachuelo ^ casasNordestinas
disponiveis = riachuelo & casasNordestinas

print(f'os produtos disponiveis em amabas as loujas são: {disponiveis}')
print(f'os produtos exclusivos em amabas as loujas são: {exclusivo}')
