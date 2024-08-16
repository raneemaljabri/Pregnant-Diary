/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProjectTree allfeeling = new ProjectTree();
        allfeeling.root = new NodeTree(new Feeling("2022"));
        NodeTree firstsim = allfeeling.addRecursive(allfeeling.root, new Feeling("first Simister"), true);
        NodeTree secsim = allfeeling.addRecursive(allfeeling.root, new Feeling("second Simister"), false);
        NodeTree fmonth = allfeeling.addRecursive(firstsim, new Feeling("first month"), true);
        NodeTree lmonth = allfeeling.addRecursive(firstsim, new Feeling("second month"), false);
        NodeTree fwee = allfeeling.addRecursive(fmonth, new Feeling("first week"), true);
        NodeTree sweek = allfeeling.addRecursive(fmonth, new Feeling("second week"), false);
        NodeTree thirdweek = allfeeling.addRecursive(lmonth, new Feeling("third week"), true);
        NodeTree foweek = allfeeling.addRecursive(lmonth, new Feeling("forthweek Simister"), false);

        
        NodeTree fmonth2 = allfeeling.addRecursive(secsim, new Feeling("first Simister"), true);
        NodeTree lmonth2 = allfeeling.addRecursive(secsim, new Feeling("second Simister"), false);
        NodeTree fwee2 = allfeeling.addRecursive(fmonth2, new Feeling("first Simister"), true);
        NodeTree sweek2 = allfeeling.addRecursive(fmonth2, new Feeling("second Simister"), false);
        NodeTree thirdweek2 = allfeeling.addRecursive(lmonth2, new Feeling("first Simister"), true);
        NodeTree foweek2 = allfeeling.addRecursive(lmonth2, new Feeling("second Simister"), false);
        Scanner scan = new Scanner(System.in);
        int ch = 0;
        while (ch != 8) {
            System.out.println("1. Add Feeling\n"
                    + "2. Delete Feeling\n"
                    + "3. Find specific Feeling \n"
                    +"4.Find feeling specific happen"
                    + "4. Print all Feeling\n"
                    + "5. Exit");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter Feeling to add  ");
                    String er = scan.nextLine();
                    allfeeling.addRecursive(er);
                    break;
                case 2:
                    allfeeling.Delete();
                    break;
                case 3:
                    System.out.println("enter feeling to find ");
                    String er2 = scan.nextLine();
                  allfeeling.Search(er2);
                    break;
                case 4:
                   allfeeling.SearchHappen();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }

        }

    }

}
