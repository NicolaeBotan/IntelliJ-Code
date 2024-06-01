public class NewPracticeGitAndGitHub {
    public static void main(String[] args) {
        System.out.println("I am the New Class Of GitHub");

        String word = "Mentoring";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(word.toUpperCase());
        System.out.println(reversedWord.toUpperCase());
    }
}
