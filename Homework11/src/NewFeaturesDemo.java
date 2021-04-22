public class NewFeaturesDemo {
    public static void main(String[] args) {
                                                        //Record demo
        System.out.println(new User("Ihor", 21));

        System.out.println();
                                                        //Text block demo
        String text = """
                New
                option
                of
                writing
                string
                lines
                .
                """;
        System.out.println(text);

        System.out.println();
                                                        //Switch expressions
        Names nameIhor = Names.IHOR;
        Names nameDaniil = Names.DANIIL;
        switch (nameIhor){
            case IHOR -> System.out.println("Ihor");
            case MAX -> System.out.println("Max");
            case DANIIL -> System.out.println("Daniil");
        }

        var name = switch (nameDaniil){
            case IHOR -> "Ihor";
            case MAX -> "Max";
            case DANIIL -> "Daniil";
        };
        System.out.println(name);

        System.out.println();
                                                        //Pattern Matching
        Object o = 40;
        if(o instanceof Integer i){
            System.out.println(i+i*i);
        }

        System.out.println();
                                                        //Demonstration better version of NullPointerException message
        Person person = new Person();
        var street = person.getAddress().getCountry().getZipCode();
    }
}
