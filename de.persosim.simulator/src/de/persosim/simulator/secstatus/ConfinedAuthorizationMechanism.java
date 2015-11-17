package de.persosim.simulator.secstatus;

import de.persosim.simulator.protocols.Oid;
import de.persosim.simulator.protocols.ta.Authorization;

public class ConfinedAuthorizationMechanism implements SecMechanism{
	
	private AuthorizationStore authorizationStore;
	
	public ConfinedAuthorizationMechanism(ConfinedAuthorizationMechanism authorizationMechanism) {
		authorizationStore = authorizationMechanism.getAuthorizationStore();
	}
	
	public ConfinedAuthorizationMechanism(AuthorizationStore authorizationStore) {
		this.authorizationStore = authorizationStore.clone();
	}
	
	@Override
	public boolean needsDeletionInCaseOf(SecurityEvent event) {
		if(event.equals(SecurityEvent.SECURE_MESSAGING_SESSION_ENDED)) {
			return true;
		}
		
		return false;
	}

	public Authorization getAuthorization(Oid oid) {
		return authorizationStore.getAuthorization(oid);
	}
	
	public AuthorizationStore getAuthorizationStore() {
		return authorizationStore.clone();
	}
	
	@Override
	public ConfinedAuthorizationMechanism clone() {
		return new ConfinedAuthorizationMechanism(this);
	}

}
