package org.example;

import org.example.classes.Car;
import org.example.classes.Coordinates;
import org.example.commands.SaveToFileCommand;
import org.example.classes.HumanBeing;
import org.example.collections.CollectionManager;
import org.example.enums.Mood;
import org.example.enums.WeaponType;
import org.example.utils.EnvFileReader;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static CollectionManager cm = new CollectionManager();

    public static void main(String[] args) {
        EnvFileReader reader = new EnvFileReader();
        reader.readData();
        System.out.println(reader.readData());
    }
    private static int generateId() {
        return (int) (Math.random() * 10000 + 1);
    }
}
