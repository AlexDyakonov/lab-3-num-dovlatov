package Enums;

public class SpecialHandler extends Handler{
        public static String specialHandle(SPECIAL special){
            String output = new String();
            switch (special){
                case NECESSARY ->
                        output += "Необходимо";
                case ASTHEYSAY ->
                        output += "как говорится";
                case FORTHIS ->
                        output += "Для этого";
                case THEN ->
                        output += "Затем";
                case SOMETHING ->
                        output += "Что-то вроде";
                case ANDSOON ->
                        output += "И так далее";
                case INGENERAL ->
                        output += "В общем";
                case OFC ->
                        output += "разумеется";
                case ABSOLUTELY ->
                        output += "Абсолютно точно";
                case WTF ->
                        output += "Что же произошло?";
            }
            return output;
        }

        @Override
        public String handle(SPECIAL special) {
            return specialHandle(special);
        }
}

