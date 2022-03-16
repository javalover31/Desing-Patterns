package com.pattern.model.iterstor;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator i = nameRepository.getIterator();  i.hasNext();){
            String name =(String) i.next();
            System.out.println(name);
        }
    }
}
