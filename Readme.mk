Instructions for running the service

The project named PswdServ is developed with Apache tomcat servlet template in Java in Eclipse.
PswdServ can be deployed in Amazon EC2 or other clouding framework.

Step 1, go to http://aws.amazon.com, sign into account and then open EC2 dashboard. Launch an instance.
Step 2, select the Ubuntu Server (16.04) image.
Step 3, install softwares like: Java and Tomcat 9
	Execute the following commands
	cd /opt/
	sudo wget http://mirrors.ocf.berkeley.edu/apache/tomcat/tomcat-9/v9.0.4/bin/apache-tomcat-9.0.4.tar.gz
	sudo tar xzf apache-tomcat-9.0.4.tar.gz
	sudo ln -s apache-tomcat-9.0.4 tomcat
	echo "export CATALINA_HOME=\"/opt/tomcat\"" >> ~/.bashrc
	source ~/.bashrc
	cd /opt/tomcat
	sudo bin/startup.sh
	
Step 4, run PswdServ.war on EC2  
	1. In Eclipse, select File -> Export -> Web->war File, save the war file to disk.
	2. Copy the war file to EC2 instance.
	3. Copy PswdServ.war from /home/xxx/PswdServ.war to /opt/tomcat/webapps		
	4. Change the conf.properties to config passwd and group file directory, the conf.properties is:
		/opt/tomcat/webapps/PswdServ/conf.properties
	5. Change the port from 8080 to 80
		sudo vim /opt/tomcat/conf/server.xml
	6. Restart tomcat 
		sudo /opt/tomcat/bin/shutdown.sh
		sudo /opt/tomcat/bin/shartup.sh
	7. Visit http://IP_ADDRESS/PswdServ to see if the server is started correctly
	

	
