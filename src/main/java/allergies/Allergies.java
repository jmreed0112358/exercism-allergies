package allergies;

import java.util.List;
import java.util.ArrayList;

import allergies.enums.Allergen;

public class Allergies
{
	private int allergyCode;
	
	public Allergies( int allergyCode )
	{
		this.allergyCode = allergyCode;
	}

	public boolean isAllergicTo( Allergen allergen ) {
		return false;
	}
	
	public List<Allergen> getList( ) {
		List<Allergen> allergenList = new ArrayList<Allergen>();
		
		return allergenList;
	}
}
