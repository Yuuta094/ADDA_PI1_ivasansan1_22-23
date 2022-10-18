package ejercicio1;

import java.util.List;
import java.util.Map;

import us.lsi.common.List2;
import us.lsi.common.Map2;

public class RecursivaFinalE1 {

	public static Map<Integer, List<String>> ejercicio1_RecFinal(Integer varA, String varB, Integer varC, String varD,
			Integer varE) {
		return ejercicio1_RecFinal(varA, varB, varC, varD, varE, Map2.empty(), EnteroCadena.of(varA, varB));
	}

	public static Map<Integer, List<String>> ejercicio1_RecFinal(Integer varA, String varB, Integer varC, String varD,
			Integer varE, Map<Integer, List<String>> map, EnteroCadena ec) {

		if (ec.a() < varC) {
			String ec2 = ec.s() + varD;
			if (ec2.length() < varE) {
				Integer key = ec2.length();
				if (map.containsKey(key)) {
					List<String> ls = map.get(key);
					ls.add(ec2);
					map.put(key, ls);
				} else {
					map.put(key, List2.of(ec2));
				}
			}
			if (ec.a() % 3 == 0) {
				map = ejercicio1_RecFinal(varA, varB, varC, varD, varE, map,
						EnteroCadena.of(ec.a() + 2, ec.s() + ec.a().toString()));
			} else {
				map = ejercicio1_RecFinal(varA, varB, varC, varD, varE, map,
						EnteroCadena.of(ec.a() + 2, ec.s().substring(ec.a() % ec.s().length())));
			}
		}
		return map;
	}
}
