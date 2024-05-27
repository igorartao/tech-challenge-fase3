#!/bin/bash

DB_HOST=db
DB_PORT=3306
# Criei o bash para esperar o banco de dados subir antes de iniciar a aplicação se não da connnection refused
# O script verifica se o banco de dados está no ar, caso não esteja, ele aguarda 1 segundo e tenta novamente
until nc -z $DB_HOST $DB_PORT; do
  echo "Aguardando banco de dados inicializar..."
  sleep 1
done

echo "Banco de dados no ar!"

# Saída do script
exit 0
