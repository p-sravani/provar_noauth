package org.provar.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.provar.messenger.database.DatabaseClass;
import org.provar.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("GeraintWaters", new Profile(1L, "Geraint", "Waters", "Product Manager"));
		profiles.put("PaulNoffke", new Profile(2L, "Paul", "Noffke", "Chief Architect"));
		profiles.put("RichardClark", new Profile(3L, "Richard", "Clark", "Chief Technology Officer"));
		profiles.put("HettyBoardmanWeston", new Profile(4L, "Hetty", "Boardman-Weston", "Head of Marketing"));
		profiles.put("AshutoshSharma", new Profile(5L, "Ashutosh", "Sharma", "Practice Lead"));
		profiles.put("NeelamSharma", new Profile(6L, "Neelam", "Sharma", "People Manager"));
		profiles.put("RavindraYadav", new Profile(7L, "Ravindra", "Yadav", "Test Architect"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values()); 
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getFirstName()+profile.getLastName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getRole().isEmpty()) {
			return null;
		}
		profiles.put(profile.getFirstName()+profile.getLastName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
	
}
