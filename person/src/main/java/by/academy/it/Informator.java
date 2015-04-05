package by.academy.it;

public class Informator 
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setAge( 30 );
        person.setName( "John" );
        person.setSurName( "Smith" );
        System.out.println( person.toString() );
    }
}