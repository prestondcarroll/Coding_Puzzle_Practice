package q6;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;


    public void enqueue(Animal a){
        a.setOrder(order);
        order++;


        if (a instanceof Dog){
            dogs.addLast((Dog) a);
        }
        if(a instanceof  Cat){
            cats.addLast((Cat) a);
        }

    }


    public Animal dequeueAny(){
        if(dogs.size() == 0 ){
            return dequeueCats();
        }
        else if(cats.size() == 0){
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }

    }


    public Animal peek(){
        if (dogs.size() == 0) {
            return cats.peek();
        } else if (cats.size() == 0) {
            return dogs.peek();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if (dog.isOlderThan(cat)) {
            return dog;
        } else {
            return cat;
        }


    }

    public int size(){
        return dogs.size() + cats.size();
    }



    public Cat dequeueCats(){
        return cats.poll();
    }

    public Dog dequeueDogs(){
        return dogs.poll();
    }



    public Cat peekCat(){
        return cats.peek();
    }

    public Dog peekDog(){
        return dogs.peek();
    }




}
