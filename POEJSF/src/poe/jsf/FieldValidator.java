package poe.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value="fieldValidator")
public class FieldValidator implements Validator{



	@Override
	public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
		String prenom = (String)value;
		UIInput composantNom = (UIInput) component.getAttributes().get("attributNom");
		String nom = (String) composantNom.getValue(); 
		
		System.out.println(nom);
		System.out.println(prenom);
		if(nom.equals(prenom)) {
			System.out.println("ytfqcYJTDFCYE");
			FacesMessage fmsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, " Erreur de nom et prenom", "votre nom est identique au prenom !");
			throw new ValidatorException(fmsg);
		}
		// TODO Auto-generated method stub

	}

}
