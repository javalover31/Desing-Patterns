package com.pattern.model.iterstor;

public class NameRepository implements Container{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }
}
