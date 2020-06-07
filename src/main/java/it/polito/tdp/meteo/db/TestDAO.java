package it.polito.tdp.meteo.db;

import java.util.List;

import it.polito.tdp.meteo.model.Situazione;

public class TestDAO {

	/**
	 * Test method for class {@link MeteoDAO}
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		MeteoDAO dao = new MeteoDAO() ;
		
		List<Situazione> list = dao.getAllSituazioni() ;
		
		for( Situazione s : list ) {
			System.out.format("%-10s %2td/%2$2tm/%2$4tY %3d°C-%3d°C  %3d%%  %s\n", 
					s.getLocalita(), s.getData(), s.getTMin(), s.getTMax(), s.getUmidita(), s.getFenomeni()) ;
		}

	}

}
