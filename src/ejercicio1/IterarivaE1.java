package ejercicio1;

import java.util.List;
import java.util.Map;

import us.lsi.common.List2;
import us.lsi.common.Map2;

public class IterarivaE1 {

	public static Map<Integer, List<String>> ejercicio1_Iterativo(Integer varA, String varB, Integer varC, String varD,
			Integer varE) {

		EnteroCadena ec = EnteroCadena.of(varA, varB);
		Map<Integer, List<String>> map = Map2.empty();

		while (ec.a() < varC) {

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
				ec = EnteroCadena.of(ec.a() + 2, ec.s() + ec.a().toString());
			} else {
				ec = EnteroCadena.of(ec.a() + 2, ec.s().substring(ec.a() % ec.s().length()));
			}
		}
		return map;
	}

//	public static Map<Integer, List<String>> ejercicio1_Iterativo(Integer varA, String varB, Integer varC, String varD, Integer varE) {
//		
//		Map<Integer, List<String>> map = Map2.empty();
//		EnteroCadena ec = EnteroCadena.of(varA, varB);
//
//		while (ec.a() < varC) {
//			String ec2 = ec.s() + varD;
//
//			if (ec2.length() < varE) {
//				Integer key = ec2.length();
//				if (map.containsKey(key)) {
//					map.get(key).add(ec2);
//				} else if (!map.containsKey(key)) {
//					List<String> ls = List2.empty();
//					ls.add(ec2);
//					map.put(key, ls);
//				}
//			}
//			if (ec.a()%3== 0) {
//				ec = EnteroCadena.of(ec.a() + 2, ec.s() + ec.a().toString());
//			} else {
//				ec = EnteroCadena.of(ec.a() + 2, ec.s().substring(ec.a() % ec.s().length()));
//			}
//		}
//		return map;
//	}
}
