import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class java{
    public static void main(String[] args) {
        //создание массива
        List<Integer> Array = new ArrayList<>();
        //добавление в массив значение типа Integer
        Array.add(1);
        Array.add(2);
        Array.add(3);
        System.out.println(Array);
        
        //создание стека 
        Stack<String> stack = new Stack<>();
        //добавление в стек значений типа String
        stack.push("Hello");
        stack.push("Teacher");
        stack.push("!");

        String top = stack.pop(); 
        System.out.println(top); //удалили знак !
        System.out.println(stack);//вывод стека

    }
    
}



