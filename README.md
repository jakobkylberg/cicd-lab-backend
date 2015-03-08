# cicd-lab-backend
Backendapplikation för CI/CD-labben

## Bygg och starta

Bygg:

	$ mvn clean package
	
Packa upp tar.gz:en i lämplig katalog t.ex.:
	
	$ tar xzvf target/cicd-lab-backend-1.0-bin.tar.gz -C ~
	
Starta applikationen:
	
	$ cd ~/cicd-lab-backend-1.0 && ./application.sh start
	
application.sh-skriptet kan bl.a. starta, stoppa och visa status:

    $ ./application.sh [start|stop|restart|debug|status]
