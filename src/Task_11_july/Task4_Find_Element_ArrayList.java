package Task_11_july;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_Find_Element_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        System.out.println(cities);

        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the name of city");
      String inputCity=  s1.nextLine();

     if(cities.contains(inputCity))
      {
          System.out.println("city is in list");
      }
      else {
          System.out.println("city is not in list");
      }
      s1.close();



       //  case-insensitive

        boolean found = false;
        for(String city: cities) {
            if (city.equalsIgnoreCase(inputCity)) {
                found = true;
                break;
            }
        }
            if(found)
            {
                System.out.println("city is in list");
            }
            else
            {
                System.out.println("city is not in list");
            }
        }


    }

