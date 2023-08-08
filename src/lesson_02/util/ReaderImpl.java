package lesson_02.util;

import lesson_02.Cat;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderImpl implements Reader {
    private final Path rootDir = Paths.get(".").normalize().toAbsolutePath();
    private final String fileName = rootDir + "/src/resources/file.txt";

    @Override
    public void printCats() {
        for (Cat c : catsFromFile()) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    @Override
    public Cat findCat(Long id) {
        for (Cat c : catsFromFile()) {
            if (c != null && c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Cat[] addCat(Cat newCat) {
        Cat[] currentCats = catsFromFile();
        currentCats[currentCats.length] = newCat;
        writeCatsInFile(currentCats);
        return currentCats;
    }

    public Cat[] catsFromFile() {
        BufferedReader reader;
        Cat[] cats = new Cat[10];
        try {
            reader = new BufferedReader(new FileReader(fileName));
            int count = 0;
            while (true) {
                Cat cat = new Cat();
                cat.setId(Long.valueOf(reader.readLine()));
                cat.setName(reader.readLine());
                cat.setBreed(reader.readLine());
                cat.setColour(reader.readLine());
                cats[count] = cat;
                count++;
                if (reader.readLine() == null) break;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cats;
    }

    public int countCats(Cat [] cats) {
        int count = 0;
        for (Cat c :
                cats) {
            if (c != null) count++;
        }
        return count;
    }

    public void writeCatsInFile(Cat[] cats) {
        File file;
        FileOutputStream fileOutStream = null;
        try {
            file = new File(fileName);
            fileOutStream = new FileOutputStream(file);
                for (Cat c : cats) {
                    if (c != null) {
                        byte[] b;
                        b = (c.getId() + "\n").getBytes();
                        fileOutStream.write(b);
                        b = (c.getName() + "\n").getBytes();
                        fileOutStream.write(b);
                        b = (c.getBreed() + "\n").getBytes();
                        fileOutStream.write(b);
                        b = (c.getColour() + "\n").getBytes();
                        fileOutStream.write(b);
                        String enter = "\n";
                        if (c.getId() < countCats(cats)) {
                            b = enter.getBytes();
                            fileOutStream.write(b);
                        }
                    }
                }
//            fileOutStream.flush();
//            fileOutStream.close();
//            System.out.println("File writing done.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutStream != null) {
                    fileOutStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void printInstruction() {
        System.out.println("�� ����� � ��������� ��� ������ � ������!");
        System.out.println("��� ������ � ������ ������� ����� ������ ��� ��������!");
        System.out.println(" 1 - �������� ��� ��������� ���� � �� �����������");
        System.out.println(" 2 - �������� ���� �� ��� ID (���� �� � �������)");
        System.out.println(" 3 - ��������� ������ ����");
        System.out.println(" 4 - ������������� ����");
        System.out.println(" 5 - ������� ����");
        System.out.println(" ��� ������ �������� 0");
    }
}


