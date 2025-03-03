package org.example.commands;

import org.example.utils.EnvFileWriter;
import org.example.classes.HumanBeing;
import org.example.collections.CollectionManager;

import java.util.ArrayList;

/**
 * Команда для сохранения текущей коллекции в файл формата JSON.
 */
public class SaveToFileCommand extends Command {

    /** Описание команды */
    private final String description = "Сохраняет текущую коллекцию в файл формата JSON";

    /** Название команды */
    private final String nameOfCommand = "save";

    /** Менеджер коллекции */
    private final CollectionManager collectionManager;

    /**
     * Конструктор класса SaveToFileCommand.
     *
     * @param collectionManager Менеджер коллекции, содержащий данные
     */
    public SaveToFileCommand(CollectionManager collectionManager) {
            this.collectionManager = collectionManager;
}

/**
 * Выполняет команду сохранения коллекции в файл.
 */
@Override
public void execute() {
    ArrayList<HumanBeing> data = collectionManager.getCollection();
    EnvFileWriter fileWriter = new EnvFileWriter();
    fileWriter.writeData(data);
    System.out.println("Коллекция успешно сохранена в файл.");
}

/**
 * Возвращает описание команды.
 *
 * @return описание команды
 */
@Override
public String getDescription() {
    return description;
}
}
