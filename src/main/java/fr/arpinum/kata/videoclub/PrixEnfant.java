package fr.arpinum.kata.videoclub;

public class PrixEnfant extends Prix {

	@Override
	public int getCodePrix() {
		return Film.ENFANTS;
	}
	
	@Override
	double montantPour(int joursLoués) {
		double résultat = 1.5;
		if (joursLoués > 3) {
			résultat += (joursLoués - 3) * 1.5;
		}
		return résultat;
	}

}
