#!/bin/sh
rm -rf ./app
mkdir -p ./app
cp -r ./resources/lib/ ./app/lib/
cp run.sh app/start.sh
jar -cvfe  app/app.jar by.rakovets.calculator.CalculatorApplication -C out/classes .
