package lesson_02.util;

import lesson_02.Cat;

import java.io.File;

public interface Reader {
    // Печать котов
    void printCats();

    Cat findCat(Long id);

    Cat [] addCat(Cat newCat);
}
