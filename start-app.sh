#!/bin/bash
cd /home/kaif/azure-vm-java-app
pkill -f "java -jar" || true
sleep 1
nohup java -jar target/simple-java-app-1.0.jar > app.log 2>&1 &
sleep 2
echo "Application started"
