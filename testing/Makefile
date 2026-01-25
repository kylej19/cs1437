JAVAC = javac
JAR   = jar
# -d sets the destination for .class files
# -sourcepath ensures javac knows where to look for dependencies
JFLAGS = -d $(OBJ_DIR) -sourcepath $(SRC_DIR)

SRC_DIR = src
OBJ_DIR = obj
BIN_DIR = bin

TARGET = $(BIN_DIR)/probe.jar
SOURCES = $(wildcard $(SRC_DIR)/*.java)
# This converts src/Main.java to obj/Main.class
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(OBJ_DIR)/%.class)

all: $(TARGET)

$(TARGET): $(CLASSES)
	@mkdir -p $(BIN_DIR)
	$(JAR) --create --file $(TARGET) --main-class Main -C $(OBJ_DIR) .

$(OBJ_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(OBJ_DIR)
	$(JAVAC) $(JFLAGS) $<

clean:
	rm -rfv $(OBJ_DIR) $(BIN_DIR)

run:
	java -jar $(TARGET)

.PHONY: all clean run
