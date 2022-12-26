public class Strings {
    public static void main(String[] args) {
        String message = "Today is very nice day.";
        System.out.println(message);

        System.out.println("number of characters in the message : " + message.length());
        System.out.println("character 5 = " + message.charAt(4)); //character 5 = y
        String message2 = "Horreeee!";
        System.out.println(message.concat(message2));
        System.out.println(message.startsWith("T")); //true
        System.out.println(message.startsWith("t")); // false becouse java is case sensitieve
        System.out.println(message.endsWith(".")); //true
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters); // Today
        System.out.println(message.indexOf('a')); // 3
        System.out.println(message.indexOf("ve")); //9
        System.out.println(message.lastIndexOf('y'));//21

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);// Today-is-very-nice-day.

        System.out.println(message.substring(6)); //is very nice day.
        System.out.println(message.substring(0,5));//Today

        for (String words : message.split(" ")){
            System.out.println(words);
            //Today
            //is
            //very
            //nice
            //day
        }
        System.out.println(message.toLowerCase()); //today is very nice day.
        System.out.println(message.toCharArray()); //Today is very nice day.
        System.out.println(message.toUpperCase()); //TODAY İS VERY NİCE DAY.
        System.out.println(message.trim()); // Today is very nice day.



    }


}
