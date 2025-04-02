INSERT INTO ruidos (nivel, horario) VALUES
(85, '12:24'),
(92, '12:45'),
(95, '13:00'),
(98, '13:30'),
(101, '14:00'),
(103, '14:15'),
(107, '14:30'),
(110, '15:00'),
(114, '15:15'),
(117, '15:30'),
(120, '16:00'),
(120, '16:15'),
(122, '16:30'),
(125, '17:00'),
(127, '17:15'),
(112, '17:30');


INSERT INTO relatorio (descricao_lab, contexto, fonte_dados, metodo_amostragem, eda)
VALUES 
('Pesquisa de Qualidade do Ar', 
 'Este relatório analisa a qualidade do ar em diferentes regiões urbanas e sua relação com doenças respiratórias na população local. A pesquisa foca na medição de partículas finas (PM2.5) e outros poluentes.',
 'Dados coletados de 5 estações de monitoramento de qualidade do ar espalhadas pela cidade, com medição de poluentes a cada hora.',
 'Amostragem de dados foi realizada por meio de sensores de partículas e gases em pontos estratégicos da cidade, considerando diferentes condições climáticas e horários do dia.',
 'A análise exploratória dos dados (EDA) identificou picos de poluição durante o inverno e correlações com o aumento de doenças respiratórias nos hospitais locais.'
),
('Pesquisa sobre Poluição Sonora', 
 'O estudo avalia os níveis de poluição sonora em áreas urbanas densamente povoadas. O foco está no impacto do tráfego e da atividade industrial sobre a saúde auditiva da população.',
 'Dados de medições de ruído obtidos em 10 pontos diferentes da cidade usando medidores de som durante o dia e à noite.',
 'Amostragem de dados de ruído foi feita em horários de pico de tráfego e em áreas residenciais. Foram utilizados medidores de nível de pressão sonora (dB).',
 'A análise exploratória (EDA) mostrou que os níveis de ruído eram mais elevados perto de zonas industriais e áreas com tráfego intenso, afetando negativamente a qualidade de vida dos moradores.'
),
('Pesquisa sobre Impacto do Uso de Agrotóxicos', 
 'Este estudo investiga os efeitos do uso de agrotóxicos na saúde do solo e nas culturas agrícolas. A pesquisa busca compreender o impacto ambiental e na qualidade dos produtos cultivados.',
 'Dados coletados de 10 fazendas em áreas agrícolas, com amostras de solo e planta enviadas a um laboratório para análise de resíduos de agrotóxicos.',
 'Amostragem foi feita em diferentes profundidades de solo (0-10 cm e 10-20 cm) e nas plantas (folhas, frutos) para análise de resíduos de substâncias químicas.',
 'A análise exploratória dos dados (EDA) revelou uma correlação entre o uso excessivo de certos agrotóxicos e a diminuição da biodiversidade do solo e a contaminação das colheitas.'
),
('Pesquisa sobre Efeitos de Exercícios Físicos na Saúde Mental', 
 'Este estudo examina como a prática regular de atividades físicas influencia o bem-estar psicológico e os níveis de estresse entre adultos jovens.',
 'Dados obtidos por meio de questionários aplicados a 200 participantes que realizaram atividades físicas por no mínimo 3 vezes por semana durante 6 meses.',
 'Amostragem foi feita por meio de um questionário padrão sobre níveis de estresse, humor e qualidade de vida antes e depois de um programa de exercícios físicos.',
 'A análise exploratória dos dados (EDA) revelou uma redução significativa nos níveis de estresse e uma melhora no humor dos participantes, especialmente entre aqueles que praticaram exercícios aeróbicos.'
);