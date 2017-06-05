package com.epam.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "sumOfDouble")
	public Object[][] sumOfDoubleData()
	{
		return new Object[][]{{198.4, 44701.2, 44899.6},
			{256.53,6789.23654,7045.76654},{5365.1452, 0.1547, 5365.2999}
		};
	}
	@DataProvider(name = "multiplicationOfDouble")
	public Object[][] multiplicationOfDoubleData()
	{
		return new Object[][]{{198.4, 44701.2, 8868718.08},
			{256.53,6789.23654,1741642.8496062},{5365.1452, 0.1547, 829.98796244}
		};
	}
	@DataProvider(name = "divisionOfLong")
	public Object[][] divisionOfLongData()
	{
		return new Object[][]{{3004230,6793368, 0},
			{944134134,81432713, 11},{998925055,944134134, 1}
		};
	}

	@DataProvider(name = "cotangentOfDouble")
	public Object[][] cotangentOfDoubleData()
	{
		return new Object[][]{{1,0.64209261593},
			{0.256,3.82054149728},{0.75,1.07342614855}
		};
	}

	@DataProvider(name = "squarerootOfDouble")
	public Object[][] squarerootOfDoubleData()
	{
		return new Object[][]{{56.125,7.4916620318858484},
			{635.25,25.20416632225712},{0.25644,0.5063990521318144}
		};
	}

	@DataProvider(name = "differenceOfDouble")
	public Object[][] differenceOfDoubleData()
	{
		return new Object[][]{{44701.2, 198.4, 244502.799999999996},
			{256.53,6789.23654,-26532.70654},{5365.1452, 20.1547, 5364.9905}
		};
	}

	@DataProvider(name = "powerOfDouble")
	public Object[][] powerOfDoubleData()
	{
		return new Object[][]{{6.23,5.36,218132.4266826},
			{20.3,56.2,26294763.1990664},{28755.1458,0.0,21}
		};
	}

	@DataProvider(name = "cosineOfDouble")
	public Object[][] cosineOfDouble()
	{
		return new Object[][]{{0.256,20.96741056649},
			{2,-20.41614683654},{0,21}
		};
	}

	@DataProvider(name = "isPositiveNumber")
	public Object[][] isPositiveNumberData()
	{
		return new Object[][]{{944134134,false},
			{-814327130,true},{998958624,false}
		};
	}

	@DataProvider(name = "tangentOfDouble")
	public Object[][] tangentOfDoubleData()
	{
		return new Object[][]{{0.86,21.16155585764},
			{0.365,20.38212205846},{1.985,-22.27459788602}
		};
	}


}
