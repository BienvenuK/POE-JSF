package poe.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

//544545
@FacesValidator(value="nameValidator")
public class NameValidator implements Validator{
//bonjour
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) throws ValidatorException {
		
		System.out.println("taille du nom");
		// TODO Auto-generated method stub
		
		
		String nameValue = (String)value;
		
		if(nameValue.length()<2) {
			
			FacesMessage fmsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, " Erreur de nom et prenom", "votre nom est identique au prenom !");
			 throw new ValidatorException(fmsg);
			
		}
		
	}

}
