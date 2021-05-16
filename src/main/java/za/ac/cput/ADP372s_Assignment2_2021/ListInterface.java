package za.ac.cput.ADP372s_Assignment2_2021;

import java.util.LinkedList;
import java.util.List;

public class ListInterface {

    private String groceries = "";

    public String getGroceries() {
        return groceries;
    }

    public void setGroceries(String groceries) {
        this.groceries = groceries;
    }


    List <String> listGroceries = new LinkedList<>();

    public void addList(String list){

        listGroceries.add("Bread");
        listGroceries.add("Milk");
        listGroceries.add("Eggs");
        listGroceries.add("Toys");
        listGroceries.add("Cheese");
        listGroceries.add("Fruit");

        System.out.println(list);


    }

    public void deleteSet(Integer list){

        listGroceries.remove(3);

        System.out.println("After removing " +list+ " there will be 4 items left");
        String data = listGroceries.get(list);

        System.out.println(data);

    }

    public void findSet(){

        String data = listGroceries.get(1);

        System.out.println(data);

    }

}
