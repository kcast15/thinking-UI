package testing.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import testing.ui.CrearContactoPage;


public class CrearContactoConDatos implements Task    {

    private final String firstName;
    private final String lastName;
    private final String birthdate;
    private final String email;
    private final String phone;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String postalCode;
    private final String country;

    public CrearContactoConDatos(String firstName, String lastName, String birthdate, String email, String phone, String address1, String address2, String city, String state, String postalCode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(CrearContactoPage.NEWCONTACT_BUTTON),
                Enter.theValue(firstName).into(CrearContactoPage.FIRSTNAME_INPUT),
                Enter.theValue(lastName).into(CrearContactoPage.LASTNAME_INPUT),
                Enter.theValue(birthdate).into(CrearContactoPage.BIRTHDATE_INPUT),
                Enter.theValue(email).into(CrearContactoPage.EMAIL_INPUT),
                Enter.theValue(phone).into(CrearContactoPage.PHONE_INPUT),
                Enter.theValue(address1).into(CrearContactoPage.ADDRESS1_INPUT),
                Enter.theValue(address2).into(CrearContactoPage.ADDRESS2_INPUT),
                Enter.theValue(city).into(CrearContactoPage.CITY_INPUT),
                Enter.theValue(state).into(CrearContactoPage.STATE_INPUT),
                Enter.theValue(postalCode).into(CrearContactoPage.POSTALCODE_INPUT),
                Enter.theValue(country).into(CrearContactoPage.COUNTRY_INPUT),
                Click.on(CrearContactoPage.SAVE_BUTTON)
        );
    }
    public static CrearContactoConDatos conDatos(String firstName, String lastName, String birthdate, String email, String phone, String address1, String address2, String city, String state, String postalCode, String country) {
        return new CrearContactoConDatos(firstName, lastName, birthdate, email, phone, address1, address2, city, state, postalCode, country);
    }
}
