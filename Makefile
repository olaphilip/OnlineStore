JAVAC = javac
JAVA = java
JAVA_FILES=$(wildcard *.java)
BIN_DIR = bin
SERVER_CLASS = Server
CLIENT_CLASS = Client
RMI_PORT = 4066
JAR_FILE = OnlineStore.jar
MAIN_CLASS = Main

compile:
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(JAVA_FILES)

jar: compile
	jar cvfe $(JAR_FILE) $(MAIN_CLASS) -C $(BIN_DIR) .

run-server:
	$(JAVA) -cp $(BIN_DIR) $(SERVER_CLASS)

run-client:
	$(JAVA) -cp $(BIN_DIR) $(CLIENT_CLASS)

clean:
	rm -rf $(BIN_DIR)/*

start-rmi:
	rmiregistry $(RMI_PORT)
