package com.danielmelo.datastructures.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArraysDSTest {

	@Test
	void reverseArrayTest() {
		int[] arr = { 1, 4, 3, 2 };

		int[] res = ArraysDS.reverseArray(arr);

		Assert.assertArrayEquals(res, new int[] { 2, 3, 4, 1 });
	}

	@Test
	void reverseArray2Test() {
		int[] arr = { 6676, 3216, 4063, 8373, 423, 586, 8850, 6762 };

		int[] res = ArraysDS.reverseArray(arr);

		Assert.assertArrayEquals(res, new int[] { 6762, 8850, 586, 423, 8373, 4063, 3216, 6676 });
	}

	@Test
	void reverseArray3Test() {
		int[] arr = { 9919, 6892, 3775, 7749, 4901, 3849, 7155, 5119, 4977, 2204, 7585, 501, 9777, 9516, 8009, 4694,
				8644, 3293, 7051, 6017, 2477, 2089, 1131, 6535, 287, 9386, 7469, 7373, 2306, 140, 4169, 6679, 9245,
				2911, 4904, 9838, 5929, 6579, 5380, 1562, 1236, 2234, 8124, 2728, 1387, 4282, 7869, 3462, 2366, 7671,
				313, 6881, 5071, 348, 2435, 6941, 2290, 7027, 6897, 1516, 7006, 2376, 2792, 165, 8683, 1753, 3251, 1039,
				6018, 1640, 44, 5586, 9631, 6263, 2289, 9372, 2978, 9082, 576, 218, 3640, 8824, 2970, 7050, 8038, 5018,
				5619, 1135, 2863, 6122, 7728, 5852, 2856, 4933, 3783, 1351, 7722, 5561, 2242, 2423, 1984, 1559, 1996,
				1062, 3908, 8033, 4961, 7808, 5926, 652, 194, 4946, 1716, 9471, 6878, 8955, 402, 1890, 9114, 6189, 6852,
				4272, 3993, 44, 7327, 6404, 3428, 1997, 3627, 4751, 4627, 5816, 2851, 4912, 7554, 8903, 7762, 7946,
				4509, 2148, 2951, 1857, 1363, 4318, 3794, 8108, 997, 4292, 468, 628, 6776, 6551, 6290, 3635, 6015, 7516,
				1602, 1110, 9921, 2248, 1949, 4251, 4024, 5841, 2939, 2947, 1695, 5043, 6873, 2544, 5027, 6648, 3413,
				2280, 2787, 6350, 5056, 1087, 9760, 8149, 5883, 3632, 9645, 3710, 4778, 6565, 7839, 3548, 5395, 9898,
				5005, 230, 7999, 2269, 6720, 2227, 3096, 7984, 6628, 5884, 1497, 9141, 1973, 5628, 8897, 4240, 9506,
				5315, 8735, 7017, 893, 302, 6806, 1799, 6361, 2656, 4187, 1525, 2538, 8061, 8545, 8512, 4840, 5001, 739,
				3670, 8907, 4940, 6906, 872, 6608, 1952, 4034, 2744, 5634, 6481, 4713, 4299, 3937, 3307, 1952, 3992,
				3790, 2176, 2599, 4071, 7484, 4271, 9748, 8867, 5472, 3325, 7725, 7160, 7186, 5343, 2904, 4052, 778,
				6925, 2434, 457, 9075, 7137, 7973, 4617, 1354, 389, 207, 9144, 3423, 2168, 1057, 4526, 6114, 5849, 2701,
				2514, 6311, 7978, 1623, 7151, 3506, 7294, 5061, 3074, 6187, 1226, 6383, 6073, 7259, 8807, 7086, 3733,
				8125, 4094, 1808, 5000, 2989, 2378, 5138, 2392, 6683, 2633, 164, 8586, 4873, 6011, 2361, 4294, 7000,
				6033, 4291, 8105, 4751, 9262, 6202, 8462, 8211, 4345, 8006, 9188, 6047, 3113, 4384, 4651, 6318, 9431,
				8133, 7478, 6395, 2431, 8498, 5449, 9063, 6926, 5000, 699, 451, 7221, 3929, 3669, 5777, 9972, 5704,
				4577, 5895, 3087, 2029, 6844, 9323, 1772, 2910, 5477, 6711, 7650, 6903, 4139, 4086, 8988, 3890, 2113,
				8821, 5795, 9071, 2828, 7090, 599, 6589, 9203, 5936, 1926, 3534, 4750, 2433, 19, 2215, 1432, 4233, 1744,
				4989, 4797, 193, 5795, 4920, 8812, 6018, 6068, 755, 5237, 1429, 3549, 8921, 3338, 9417, 6968, 1561,
				2754, 2636, 148, 3331, 9825, 9392, 3408, 873, 7697, 7224, 4510, 9758, 7021, 1367, 1249, 6601, 1247,
				6935, 1759, 8547, 8921, 8255, 1358, 6916, 6377, 9196, 9402, 3945, 4290, 5129, 2142, 1601, 9898, 2630,
				1318, 7818, 4134, 884, 8547, 8744, 7023, 2086, 1205, 9183, 6239, 9409, 9378, 5139, 180, 8316, 2382,
				2223, 7068, 8816, 4129, 4890, 8151, 7001, 3908, 1250, 1992, 4435, 5891, 533, 5043, 9278, 8219, 771,
				3664, 3802, 1805, 2573, 8038, 8347, 7513, 8232, 2272, 3733, 2035, 8970, 5739, 928, 7874, 171, 3749, 181,
				2059, 2006, 3455, 4910, 4713, 6325, 6716, 8393, 392, 5287, 4447, 8022, 3653, 4220, 3888, 6084, 3167,
				7079, 6407, 1863, 3289, 7579, 9103, 4740, 901, 7455, 6004, 9635, 3241, 9402, 6677, 7388, 8157, 8438,
				8466, 2042, 5051, 9632, 8894, 5162, 1422, 6534, 7869, 5212, 3907, 7495, 119, 8705, 3338, 9334, 5107,
				8970, 6596, 3319, 1228, 4095, 7734, 9024, 2159, 4629, 5285, 6729, 6842, 4710, 8472, 7596, 4271, 6477,
				921, 4180, 1198, 1478, 9331, 866, 7006, 3890, 4484, 1171, 1476, 3504, 972, 3674, 8169, 2037, 5708, 8428,
				7943, 4357, 9640, 3438, 1452, 534, 8565, 5913, 4486, 3412, 9131, 38, 533, 2535, 4371, 7042, 9372, 4878,
				1673, 7451, 1472, 2663, 5706, 1872, 4070, 1555, 6695, 9348, 4952, 5671, 5536, 3226, 881, 1685, 1994,
				6618, 5420, 1975, 5769, 3435, 3400, 4644, 9990, 5766, 4982, 3768, 7833, 3673, 7273, 5824, 9583, 497,
				3332, 6779, 885, 5678, 2287, 8426, 9226, 1506, 4962, 2543, 3809, 6146, 5176, 7489, 2076, 1811, 2573,
				6326, 977, 797, 4192, 9496, 2616, 1931, 9761, 5921, 8619, 6713, 4867, 1854, 9861, 1988, 1467, 7678,
				8531, 2237, 5486, 1043, 1301, 1558, 5767, 8127, 8749, 1378, 7166, 7512, 7694, 4840, 1761, 101, 1246,
				161, 1566, 9455, 9236, 3093, 518, 3856, 5833, 4658, 1660, 8470, 8507, 2116, 3779, 9584, 6485, 4253,
				4532, 4863, 6888, 6270, 5653, 4070, 5621, 8812, 2706, 763, 4048, 5275, 9863, 3443, 9326, 950, 1090,
				7961, 6359, 6484, 7766, 6247, 7156, 5780, 99, 6266, 7553, 6466, 6446, 3810, 5212, 1214, 9455, 6959,
				6131, 268, 1005, 4565, 1722, 8318, 7827, 6968, 8034, 443, 7022, 5712, 1347, 1996, 4189, 8278, 354, 8777,
				1759, 1444, 91, 1663, 2360, 3305, 71, 1740, 3019, 5074, 2310, 4545, 4096, 2081, 983, 6111, 6400, 8762,
				6586, 7114, 1139, 2144, 8213, 537, 1928, 5388, 5051, 307, 9917, 3302, 3126, 8226, 8739, 8505, 4141,
				8019, 3499, 6563, 3486, 7524, 7034, 2818, 5429, 1173, 6728, 903, 5122, 6103, 9948, 2294, 6695, 8767,
				8513, 6180, 2903, 867, 3941, 4695, 9256, 9003, 2500, 57, 897, 6833, 7696, 5365, 3148, 8353, 268, 6344,
				6357, 5657, 5195, 6320, 968, 3721, 790, 7568, 7430, 2212, 4067, 2522, 5680, 5037, 1166, 6371, 2442,
				8858, 5651, 6546, 5321, 8260, 9473, 6528, 5189, 4133, 2568, 8920, 9895, 6007, 4795, 1096, 7755, 2955,
				4559, 8446, 7103, 6367, 6585, 3052, 9490, 7238, 6772, 9092, 6469, 4196, 4136, 4876, 7277, 9951, 1507,
				3483, 6734, 4735, 3284, 2361, 1585, 1501, 6826, 7250, 6414, 4711, 9481, 8995, 274, 5162, 7876, 3595,
				1018, 9190, 7155, 1787, 3766, 7022, 8527, 2326, 1222, 8949, 5585, 1169, 9696, 3649, 6054, 5844, 2087,
				1146, 3997, 8822, 6917, 3243, 8246, 6596, 6449, 3456, 8532, 3562, 6025, 9686, 3500, 7672, 5305, 7710,
				1987, 8798, 4370, 5242, 5156, 511, 2932, 7854, 119, 8689, 8531, 5103, 650, 6235, 6004, 8823, 6332, 8006,
				497, 6046, 796, 3708, 8305, 8274, 4062, 2540, 2480, 5360, 9893, 4403, 7229, 1832, 2378, 1715, 2390,
				8076, 1187, 7743, 9277, 2992, 5004, 2285, 4678, 747, 2945, 818, 8870, 5381, 865, 6425, 5861, 1271, 3596,
				1356, 2988, 1293, 6806, 1096, 5095, 6246, 3665, 8829, 5524, 4274, 6070, 1323, 1666, 1427, 1276, 4214,
				2882, 6252, 6319, 3779, 1193, 7316, 746, 6344, 5195, 6868, 5804, 8991, 8913, 8868, 6327, 2419, 9780 };

		int[] res = ArraysDS.reverseArray(arr);

		Assert.assertArrayEquals(res, new int[] { 9780, 2419, 6327, 8868, 8913, 8991, 5804, 6868, 5195, 6344, 746, 7316,
				1193, 3779, 6319, 6252, 2882, 4214, 1276, 1427, 1666, 1323, 6070, 4274, 5524, 8829, 3665, 6246, 5095,
				1096, 6806, 1293, 2988, 1356, 3596, 1271, 5861, 6425, 865, 5381, 8870, 818, 2945, 747, 4678, 2285, 5004,
				2992, 9277, 7743, 1187, 8076, 2390, 1715, 2378, 1832, 7229, 4403, 9893, 5360, 2480, 2540, 4062, 8274,
				8305, 3708, 796, 6046, 497, 8006, 6332, 8823, 6004, 6235, 650, 5103, 8531, 8689, 119, 7854, 2932, 511,
				5156, 5242, 4370, 8798, 1987, 7710, 5305, 7672, 3500, 9686, 6025, 3562, 8532, 3456, 6449, 6596, 8246,
				3243, 6917, 8822, 3997, 1146, 2087, 5844, 6054, 3649, 9696, 1169, 5585, 8949, 1222, 2326, 8527, 7022,
				3766, 1787, 7155, 9190, 1018, 3595, 7876, 5162, 274, 8995, 9481, 4711, 6414, 7250, 6826, 1501, 1585,
				2361, 3284, 4735, 6734, 3483, 1507, 9951, 7277, 4876, 4136, 4196, 6469, 9092, 6772, 7238, 9490, 3052,
				6585, 6367, 7103, 8446, 4559, 2955, 7755, 1096, 4795, 6007, 9895, 8920, 2568, 4133, 5189, 6528, 9473,
				8260, 5321, 6546, 5651, 8858, 2442, 6371, 1166, 5037, 5680, 2522, 4067, 2212, 7430, 7568, 790, 3721,
				968, 6320, 5195, 5657, 6357, 6344, 268, 8353, 3148, 5365, 7696, 6833, 897, 57, 2500, 9003, 9256, 4695,
				3941, 867, 2903, 6180, 8513, 8767, 6695, 2294, 9948, 6103, 5122, 903, 6728, 1173, 5429, 2818, 7034,
				7524, 3486, 6563, 3499, 8019, 4141, 8505, 8739, 8226, 3126, 3302, 9917, 307, 5051, 5388, 1928, 537,
				8213, 2144, 1139, 7114, 6586, 8762, 6400, 6111, 983, 2081, 4096, 4545, 2310, 5074, 3019, 1740, 71, 3305,
				2360, 1663, 91, 1444, 1759, 8777, 354, 8278, 4189, 1996, 1347, 5712, 7022, 443, 8034, 6968, 7827, 8318,
				1722, 4565, 1005, 268, 6131, 6959, 9455, 1214, 5212, 3810, 6446, 6466, 7553, 6266, 99, 5780, 7156, 6247,
				7766, 6484, 6359, 7961, 1090, 950, 9326, 3443, 9863, 5275, 4048, 763, 2706, 8812, 5621, 4070, 5653,
				6270, 6888, 4863, 4532, 4253, 6485, 9584, 3779, 2116, 8507, 8470, 1660, 4658, 5833, 3856, 518, 3093,
				9236, 9455, 1566, 161, 1246, 101, 1761, 4840, 7694, 7512, 7166, 1378, 8749, 8127, 5767, 1558, 1301,
				1043, 5486, 2237, 8531, 7678, 1467, 1988, 9861, 1854, 4867, 6713, 8619, 5921, 9761, 1931, 2616, 9496,
				4192, 797, 977, 6326, 2573, 1811, 2076, 7489, 5176, 6146, 3809, 2543, 4962, 1506, 9226, 8426, 2287,
				5678, 885, 6779, 3332, 497, 9583, 5824, 7273, 3673, 7833, 3768, 4982, 5766, 9990, 4644, 3400, 3435,
				5769, 1975, 5420, 6618, 1994, 1685, 881, 3226, 5536, 5671, 4952, 9348, 6695, 1555, 4070, 1872, 5706,
				2663, 1472, 7451, 1673, 4878, 9372, 7042, 4371, 2535, 533, 38, 9131, 3412, 4486, 5913, 8565, 534, 1452,
				3438, 9640, 4357, 7943, 8428, 5708, 2037, 8169, 3674, 972, 3504, 1476, 1171, 4484, 3890, 7006, 866,
				9331, 1478, 1198, 4180, 921, 6477, 4271, 7596, 8472, 4710, 6842, 6729, 5285, 4629, 2159, 9024, 7734,
				4095, 1228, 3319, 6596, 8970, 5107, 9334, 3338, 8705, 119, 7495, 3907, 5212, 7869, 6534, 1422, 5162,
				8894, 9632, 5051, 2042, 8466, 8438, 8157, 7388, 6677, 9402, 3241, 9635, 6004, 7455, 901, 4740, 9103,
				7579, 3289, 1863, 6407, 7079, 3167, 6084, 3888, 4220, 3653, 8022, 4447, 5287, 392, 8393, 6716, 6325,
				4713, 4910, 3455, 2006, 2059, 181, 3749, 171, 7874, 928, 5739, 8970, 2035, 3733, 2272, 8232, 7513, 8347,
				8038, 2573, 1805, 3802, 3664, 771, 8219, 9278, 5043, 533, 5891, 4435, 1992, 1250, 3908, 7001, 8151,
				4890, 4129, 8816, 7068, 2223, 2382, 8316, 180, 5139, 9378, 9409, 6239, 9183, 1205, 2086, 7023, 8744,
				8547, 884, 4134, 7818, 1318, 2630, 9898, 1601, 2142, 5129, 4290, 3945, 9402, 9196, 6377, 6916, 1358,
				8255, 8921, 8547, 1759, 6935, 1247, 6601, 1249, 1367, 7021, 9758, 4510, 7224, 7697, 873, 3408, 9392,
				9825, 3331, 148, 2636, 2754, 1561, 6968, 9417, 3338, 8921, 3549, 1429, 5237, 755, 6068, 6018, 8812,
				4920, 5795, 193, 4797, 4989, 1744, 4233, 1432, 2215, 19, 2433, 4750, 3534, 1926, 5936, 9203, 6589, 599,
				7090, 2828, 9071, 5795, 8821, 2113, 3890, 8988, 4086, 4139, 6903, 7650, 6711, 5477, 2910, 1772, 9323,
				6844, 2029, 3087, 5895, 4577, 5704, 9972, 5777, 3669, 3929, 7221, 451, 699, 5000, 6926, 9063, 5449,
				8498, 2431, 6395, 7478, 8133, 9431, 6318, 4651, 4384, 3113, 6047, 9188, 8006, 4345, 8211, 8462, 6202,
				9262, 4751, 8105, 4291, 6033, 7000, 4294, 2361, 6011, 4873, 8586, 164, 2633, 6683, 2392, 5138, 2378,
				2989, 5000, 1808, 4094, 8125, 3733, 7086, 8807, 7259, 6073, 6383, 1226, 6187, 3074, 5061, 7294, 3506,
				7151, 1623, 7978, 6311, 2514, 2701, 5849, 6114, 4526, 1057, 2168, 3423, 9144, 207, 389, 1354, 4617,
				7973, 7137, 9075, 457, 2434, 6925, 778, 4052, 2904, 5343, 7186, 7160, 7725, 3325, 5472, 8867, 9748,
				4271, 7484, 4071, 2599, 2176, 3790, 3992, 1952, 3307, 3937, 4299, 4713, 6481, 5634, 2744, 4034, 1952,
				6608, 872, 6906, 4940, 8907, 3670, 739, 5001, 4840, 8512, 8545, 8061, 2538, 1525, 4187, 2656, 6361,
				1799, 6806, 302, 893, 7017, 8735, 5315, 9506, 4240, 8897, 5628, 1973, 9141, 1497, 5884, 6628, 7984,
				3096, 2227, 6720, 2269, 7999, 230, 5005, 9898, 5395, 3548, 7839, 6565, 4778, 3710, 9645, 3632, 5883,
				8149, 9760, 1087, 5056, 6350, 2787, 2280, 3413, 6648, 5027, 2544, 6873, 5043, 1695, 2947, 2939, 5841,
				4024, 4251, 1949, 2248, 9921, 1110, 1602, 7516, 6015, 3635, 6290, 6551, 6776, 628, 468, 4292, 997, 8108,
				3794, 4318, 1363, 1857, 2951, 2148, 4509, 7946, 7762, 8903, 7554, 4912, 2851, 5816, 4627, 4751, 3627,
				1997, 3428, 6404, 7327, 44, 3993, 4272, 6852, 6189, 9114, 1890, 402, 8955, 6878, 9471, 1716, 4946, 194,
				652, 5926, 7808, 4961, 8033, 3908, 1062, 1996, 1559, 1984, 2423, 2242, 5561, 7722, 1351, 3783, 4933,
				2856, 5852, 7728, 6122, 2863, 1135, 5619, 5018, 8038, 7050, 2970, 8824, 3640, 218, 576, 9082, 2978,
				9372, 2289, 6263, 9631, 5586, 44, 1640, 6018, 1039, 3251, 1753, 8683, 165, 2792, 2376, 7006, 1516, 6897,
				7027, 2290, 6941, 2435, 348, 5071, 6881, 313, 7671, 2366, 3462, 7869, 4282, 1387, 2728, 8124, 2234,
				1236, 1562, 5380, 6579, 5929, 9838, 4904, 2911, 9245, 6679, 4169, 140, 2306, 7373, 7469, 9386, 287,
				6535, 1131, 2089, 2477, 6017, 7051, 3293, 8644, 4694, 8009, 9516, 9777, 501, 7585, 2204, 4977, 5119,
				7155, 3849, 4901, 7749, 3775, 6892, 9919 });
	}
}
