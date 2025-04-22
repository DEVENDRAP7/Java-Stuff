import java.util.*;
public class Stackers 
{
    public static void main(String[] args) 
    {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();  
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter elements ");   
        int a=sc.nextInt(); 
        stack.push(a);
        System.out.println("Stack: " + stack);
        int b=sc.nextInt();
        stack.push(b);
        System.out.println("Stack: " + stack);
        int c=sc.nextInt();
        stack.push(c);
        System.out.println("Stack: " + stack);
        int d=sc.nextInt();
        stack.push(d);
        System.out.println("Stack: " + stack);
        int e=sc.nextInt();
        stack.push(e);
        System.out.println("Stack: " + stack);
        int f=sc.nextInt(); // Add elements to the stack
        stack.push(f);
        System.out.println("Stack: " + stack);
        // Remove an element from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after pop: " + stack);
    }
}
