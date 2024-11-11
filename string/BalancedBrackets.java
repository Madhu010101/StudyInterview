package com.in28minutes.java.string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BalancedBrackets {

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
    {

        String expr = "([{}])";
        String expr1 = "{([}])";

        // Function call
        if (areBracketsBalanced(expr1))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

        print();
    }


    static public void print()
    {
        List<String> matchList = new ArrayList<String>();
        String s  = "[org.springframework.web.client.HttpClientErrorException$BadRequest: 400 Bad Request: ,\n" +
                "{\"output\":{\"data\":{\"correlation\":{\"traceID\":\"VODSYWTXPWBC\"}},\"errors\":{\"errorTable\":, \n" +
                "{\"errorApplId\":50065,\"errorMessage\":\"FUNCTION CURRENTLY UNAVAILABLE STAND-IN\",\"errorCode\":8519},\n" +
                ",\"replyCode\":8519,\"details\":\"FUNCTION CURRENTLY UNAVAILABLE STAND-IN\"}}}]";
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");;
        Matcher matcher = pattern.matcher(s);

        if( matcher.find() ) {
            System.out.println( matcher.group() );
        }
    }





}