import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList
{
    ArrayList<String> tasks;
       int m;
    Scanner scanner;

    ToDoList()
    {
        tasks=new ArrayList<>();
        scanner= new Scanner(System.in);
    
        
    }
    void run()
    {
        boolean running =true;
        while(running)
        {
            System.out.println("Todo list");
            System.out.println("1. create todo-list");
            System.out.println("2. remove todo-list");
            System.out.println("3. use todo-list");
            System.out.println("4. quit");
            System.out.println("\n Enter choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                System.out.println("give name");
                String taskn = scanner.nextLine();
                tasks.add(taskn);
                addtask();
                break;
                    
                case 2:
                deleteTasks();
                break;
                
                case 3:
                displayTasks();
                break;
                
                case 4:
                running= false;
                break;
                    
                default:
                System.out.println("invalid chice");
                 break;
                
                        
            }
        }
    }
    void addtask()
    {

        System.out.println("\n add task");
        scanner.nextLine();
        tasks.add(scanner.nextLine());
        create_todo();
        
    }
    void create_todo()
    {   boolean loop2 = true;
        while(loop2)
        {
         System.out.println("1. add task");
         System.out.println("2. remove todo-list");
         System.out.println("3. mark as completed✔");
         System.out.println("4. quit");
         System.out.println("choice");
         int i= scanner.nextInt();
         switch(i)
         {
             case 1:
             addtask();
             break;
             
             case 2:
             deleteTasks();
             break;
             
             case 3:
             System.out.println("task number to be markes completed");
             m = scanner.nextInt();
             displayTasks();
             
             case 4:
             loop2= false;
             break;
             
             default:
             System.out.println("invalid choice");
             break;
         }
         }
    }

    void deleteTasks()
    {
        System.out.println("\n enter task number to delete");
        int taskNum = scanner.nextInt();
        scanner.nextLine();
        if(taskNum>0 && taskNum<=tasks.size())
        {
            tasks.remove(taskNum);
            for (int i = 1; i < tasks.size(); i++) {
            System.out.println(i+". "+tasks.get(i));
        }
    }
        else
        System.out.println("invalid choice");
        
    }
    void displayTasks()//this is ok for use todo
    {
        if(tasks.isEmpty())
        {
            System.out.println("no tasks to display");
        }
        else
        {
            for(int i=1;i<=m;i++)
            {
                if(i==m)
                System.out.println((i)+"."+ tasks.get(i)+"✔");
                else
                System.out.println((i)+"."+ tasks.get(i));
                
            }
            for(int i=m+1; i<tasks.size();i++)
            {
               System.out.println((i)+"."+ tasks.get(i)); 
            }
        }
    }
    }
            

       