/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortexample;

import java.util.ArrayList;

/**
 *
 * @author GaLa
 * 
 * Data: 
 * 
 * unsortedData ascendingSortedData descendingSortedData
 * 1,000 unique data values from 1 to 100,000
 * 
 * unsorted10kData ascendingSorted10kData descendingSorted10kData
 * 10,000 unique data values from 1 to 10,000
 */
public class Data {
    static int[] unsortedData(){
        return new int[]{75431, 49047, 7789, 86769, 35384, 50616, 35085, 91023, 61898, 22471, 40721, 22404, 72260, 17077, 58320, 5475, 75576, 99689, 78012, 75227, 11675, 87318, 52203, 99152, 1595, 10782, 22692, 66704, 6644, 82812, 86571, 45900, 6815, 80848, 16144, 12909, 92063, 6363, 39736, 72764, 87868, 34780, 29415, 22580, 2171, 68931, 31119, 63662, 50398, 4505, 81035, 8797, 81762, 49245, 83817, 19251, 3573, 22209, 52180, 17894, 36382, 75457, 44191, 97910, 50748, 46494, 46552, 40184, 42039, 12159, 28347, 30709, 38259, 53088, 58163, 13516, 53781, 25150, 45182, 85929, 70151, 27818, 12773, 12401, 91191, 30790, 12790, 35861, 37871, 24456, 11535, 92846, 22826, 80852, 25102, 34235, 87814, 16761, 79229, 955, 65867, 67302, 28901, 3370, 5124, 58435, 5316, 78167, 53081, 95180, 10430, 58397, 70320, 35173, 31622, 47831, 38664, 41276, 93520, 58832, 96829, 36786, 16890, 2822, 84961, 40511, 65639, 82413, 98455, 37723, 68398, 64051, 47398, 74181, 89243, 50144, 16545, 89042, 11756, 58007, 47489, 29674, 7383, 75410, 97829, 80721, 91436, 48553, 33098, 80860, 45862, 85758, 48721, 37052, 77703, 40997, 67894, 93740, 51120, 840, 9508, 53842, 73585, 138, 26505, 14288, 56818, 40346, 82985, 34163, 15438, 98484, 10795, 43014, 83774, 19308, 12889, 4115, 37146, 13781, 77816, 61762, 57940, 13766, 21492, 5754, 20691, 87635, 91201, 31884, 73989, 77802, 36399, 61206, 90643, 83938, 2048, 5756, 36254, 93989, 65671, 41865, 16269, 81752, 55426, 50779, 11406, 63643, 59578, 69974, 95002, 87968, 36684, 7220, 88893, 77590, 69752, 64354, 75703, 37271, 50631, 26302, 16016, 58500, 25274, 26405, 82552, 7491, 55991, 41125, 16473, 47359, 32706, 91937, 57551, 20787, 35423, 52261, 63326, 76635, 4607, 82165, 90369, 40364, 80796, 54922, 7398, 47430, 7053, 21268, 42918, 21803, 88602, 89479, 32632, 91091, 71297, 66156, 43618, 27572, 15028, 17594, 46757, 15561, 80574, 30485, 70015, 18710, 80810, 65387, 56051, 27524, 83833, 38520, 62676, 26275, 23331, 35114, 56604, 57092, 89535, 33996, 1849, 79185, 70316, 62937, 14391, 88363, 90493, 16766, 46534, 73818, 55351, 77277, 97887, 84945, 24569, 93150, 25844, 58675, 23049, 29718, 54956, 66850, 61469, 55804, 16130, 68935, 18976, 90324, 98906, 38702, 12646, 32503, 89012, 12739, 80764, 89018, 16056, 90162, 23126, 52379, 96257, 43377, 93886, 89467, 39192, 12444, 78506, 57127, 86062, 56083, 62204, 32211, 61281, 70451, 40701, 33326, 10455, 12236, 40164, 3100, 35431, 48018, 35646, 29360, 41122, 30313, 61275, 13651, 51096, 63732, 73657, 23668, 98256, 74596, 31079, 13894, 657, 44932, 93452, 89966, 82307, 52495, 73582, 66431, 48653, 32473, 68532, 36662, 89693, 21042, 20867, 55985, 73093, 9741, 93826, 94728, 49160, 814, 71635, 2172, 30690, 41863, 77482, 18465, 72402, 52022, 64586, 87673, 35375, 39300, 6532, 62731, 27133, 80437, 92452, 22549, 2968, 79903, 24440, 80189, 37093, 7561, 23536, 47013, 88019, 94648, 61341, 36080, 95066, 23008, 66731, 81823, 95609, 43682, 87336, 42422, 50937, 86872, 40504, 40660, 50254, 69991, 36718, 74430, 1763, 38060, 37443, 4535, 85500, 70957, 87174, 59445, 6914, 14870, 57304, 53940, 79924, 86164, 81284, 2361, 26038, 48869, 91568, 42574, 57994, 97331, 21948, 66422, 31160, 77641, 74354, 95332, 42690, 31785, 41770, 18521, 44284, 50490, 39629, 80438, 68461, 28844, 15890, 43417, 18547, 17421, 44805, 49371, 43652, 8927, 77424, 36758, 69036, 6279, 29166, 69069, 96992, 95737, 26649, 46264, 50725, 43088, 99179, 21464, 55092, 43170, 64884, 49929, 25, 67078, 88242, 53094, 19860, 19916, 42797, 99467, 72222, 22666, 58074, 81976, 81852, 83412, 22163, 54063, 94958, 11943, 897, 12329, 27441, 92414, 67812, 59338, 37201, 21758, 38861, 37428, 22728, 19073, 85604, 99394, 29149, 17546, 90526, 51851, 56326, 20676, 78205, 37016, 87656, 8103, 94293, 17201, 84014, 60830, 47198, 40114, 85114, 63665, 85389, 72185, 11856, 82894, 97285, 23570, 70931, 58566, 14284, 96936, 37345, 49275, 79061, 42663, 79865, 69258, 91618, 58076, 96485, 3821, 76884, 75267, 83777, 39449, 32271, 18124, 79160, 32222, 32485, 35068, 71585, 89142, 56892, 91537, 62431, 20809, 91552, 98623, 30942, 66183, 47327, 92520, 53822, 5228, 14897, 60159, 45279, 4211, 18106, 9840, 26296, 73491, 38607, 32234, 93229, 24838, 57572, 11040, 50362, 20203, 7196, 15723, 11551, 11172, 13941, 40672, 6679, 40745, 66147, 39652, 51802, 73308, 22275, 4262, 18574, 18017, 28055, 81936, 75181, 37068, 95092, 96981, 19947, 64749, 62979, 48128, 84800, 47335, 69630, 3613, 21499, 86910, 92673, 25549, 77337, 42579, 51116, 96105, 38654, 91909, 81693, 57559, 96815, 76921, 72996, 5141, 99759, 91006, 22885, 93733, 17373, 31924, 30660, 55282, 15909, 71434, 27573, 62646, 551, 56510, 90115, 7745, 52677, 91067, 1214, 39904, 73380, 85842, 66531, 22748, 46962, 42478, 27790, 16270, 43531, 46958, 52540, 51018, 14132, 25308, 57762, 11531, 3454, 26348, 86706, 72492, 53368, 56645, 59134, 11653, 37658, 36904, 18066, 12190, 81835, 95383, 2016, 51571, 25065, 52381, 93951, 48137, 65751, 32857, 37639, 751, 25064, 67196, 69577, 61365, 18293, 55884, 80006, 67798, 23183, 73425, 44800, 48470, 51803, 93874, 87035, 37491, 35935, 6918, 49901, 75308, 91079, 8862, 32864, 37930, 35777, 56896, 99374, 12834, 41721, 23391, 70506, 70053, 7479, 51868, 52284, 63540, 54206, 33246, 28267, 49981, 9139, 9022, 49607, 75499, 25917, 86710, 5059, 49022, 69441, 80557, 59158, 22145, 61651, 32930, 90422, 18081, 60072, 53942, 98695, 69364, 38068, 93380, 18546, 83200, 13964, 25850, 4407, 84426, 44073, 69008, 84363, 41944, 91106, 80124, 73637, 8001, 5437, 65348, 30426, 47444, 4010, 33453, 85696, 265, 68613, 71174, 88105, 21800, 62035, 75450, 93880, 71002, 23044, 15535, 73777, 64303, 22092, 15677, 71028, 16100, 50803, 52268, 5567, 66719, 9640, 50521, 38751, 54497, 27493, 24078, 44215, 19223, 80879, 95605, 62768, 19780, 57733, 77011, 33142, 48548, 64600, 55765, 76067, 92784, 35802, 70867, 26434, 43752, 29115, 13013, 7178, 54741, 34056, 78162, 25828, 85063, 92914, 69267, 3696, 74341, 85244, 93942, 18759, 52335, 80109, 7621, 30463, 97338, 1576, 91704, 75260, 56032, 54574, 49172, 56294, 73994, 69468, 67695, 45274, 7470, 12498, 83123, 88294, 57757, 381, 30674, 66154, 66521, 29928, 2116, 17220, 14697, 7325, 84208, 32519, 96340, 40993, 78686, 39345, 7807, 67143, 59778, 18302, 48791, 16992, 56584, 39030, 70149, 88351, 85489, 96817, 31161, 18233, 79093, 24116, 83201, 42675, 23749, 88269, 56653, 36819, 88061, 89450, 88805, 26863, 32872, 38261, 63959, 81472, 91608, 52273, 36280, 95250, 93925, 16465, 26449, 63262, 54595, 3901, 22335, 83970, 24704, 16855, 27652, 65089, 77656, 96500, 52604, 1919, 76981, 82420, 22883, 77908, 90982, 36688, 80384, 44360, 90874, 78115, 78005, 51930, 98669, 30701, 47760, 90268, 67815, 31913, 47386, 30197, 49992, 75506, 42944, 59136, 27409, 59711, 13660, 51898, 71921, 84539, 10033, 11063, 11044, 67830, 66653, 34622, 85554, 70841, 89370, 81649, 53024, 69399, 28517, 40300, 9388, 44489, 66121, 66717, 72861, 46498, 73346, 38618, 75596, 27605, 30540, 7039, 74014, 74093, 44267, 35582, 56765, 78537, 69924, 74705, 54646};
    }    
    static int[] ascendingSortedData(){
        return new int[]{25, 138, 265, 381, 551, 657, 751, 814, 840, 897, 955, 1214, 1576, 1595, 1763, 1849, 1919, 2016, 2048, 2116, 2171, 2172, 2361, 2822, 2968, 3100, 3370, 3454, 3573, 3613, 3696, 3821, 3901, 4010, 4115, 4211, 4262, 4407, 4505, 4535, 4607, 5059, 5124, 5141, 5228, 5316, 5437, 5475, 5567, 5754, 5756, 6279, 6363, 6532, 6644, 6679, 6815, 6914, 6918, 7039, 7053, 7178, 7196, 7220, 7325, 7383, 7398, 7470, 7479, 7491, 7561, 7621, 7745, 7789, 7807, 8001, 8103, 8797, 8862, 8927, 9022, 9139, 9388, 9508, 9640, 9741, 9840, 10033, 10430, 10455, 10782, 10795, 11040, 11044, 11063, 11172, 11406, 11531, 11535, 11551, 11653, 11675, 11756, 11856, 11943, 12159, 12190, 12236, 12329, 12401, 12444, 12498, 12646, 12739, 12773, 12790, 12834, 12889, 12909, 13013, 13516, 13651, 13660, 13766, 13781, 13894, 13941, 13964, 14132, 14284, 14288, 14391, 14697, 14870, 14897, 15028, 15438, 15535, 15561, 15677, 15723, 15890, 15909, 16016, 16056, 16100, 16130, 16144, 16269, 16270, 16465, 16473, 16545, 16761, 16766, 16855, 16890, 16992, 17077, 17201, 17220, 17373, 17421, 17546, 17594, 17894, 18017, 18066, 18081, 18106, 18124, 18233, 18293, 18302, 18465, 18521, 18546, 18547, 18574, 18710, 18759, 18976, 19073, 19223, 19251, 19308, 19780, 19860, 19916, 19947, 20203, 20676, 20691, 20787, 20809, 20867, 21042, 21268, 21464, 21492, 21499, 21758, 21800, 21803, 21948, 22092, 22145, 22163, 22209, 22275, 22335, 22404, 22471, 22549, 22580, 22666, 22692, 22728, 22748, 22826, 22883, 22885, 23008, 23044, 23049, 23126, 23183, 23331, 23391, 23536, 23570, 23668, 23749, 24078, 24116, 24440, 24456, 24569, 24704, 24838, 25064, 25065, 25102, 25150, 25274, 25308, 25549, 25828, 25844, 25850, 25917, 26038, 26275, 26296, 26302, 26348, 26405, 26434, 26449, 26505, 26649, 26863, 27133, 27409, 27441, 27493, 27524, 27572, 27573, 27605, 27652, 27790, 27818, 28055, 28267, 28347, 28517, 28844, 28901, 29115, 29149, 29166, 29360, 29415, 29674, 29718, 29928, 30197, 30313, 30426, 30463, 30485, 30540, 30660, 30674, 30690, 30701, 30709, 30790, 30942, 31079, 31119, 31160, 31161, 31622, 31785, 31884, 31913, 31924, 32211, 32222, 32234, 32271, 32473, 32485, 32503, 32519, 32632, 32706, 32857, 32864, 32872, 32930, 33098, 33142, 33246, 33326, 33453, 33996, 34056, 34163, 34235, 34622, 34780, 35068, 35085, 35114, 35173, 35375, 35384, 35423, 35431, 35582, 35646, 35777, 35802, 35861, 35935, 36080, 36254, 36280, 36382, 36399, 36662, 36684, 36688, 36718, 36758, 36786, 36819, 36904, 37016, 37052, 37068, 37093, 37146, 37201, 37271, 37345, 37428, 37443, 37491, 37639, 37658, 37723, 37871, 37930, 38060, 38068, 38259, 38261, 38520, 38607, 38618, 38654, 38664, 38702, 38751, 38861, 39030, 39192, 39300, 39345, 39449, 39629, 39652, 39736, 39904, 40114, 40164, 40184, 40300, 40346, 40364, 40504, 40511, 40660, 40672, 40701, 40721, 40745, 40993, 40997, 41122, 41125, 41276, 41721, 41770, 41863, 41865, 41944, 42039, 42422, 42478, 42574, 42579, 42663, 42675, 42690, 42797, 42918, 42944, 43014, 43088, 43170, 43377, 43417, 43531, 43618, 43652, 43682, 43752, 44073, 44191, 44215, 44267, 44284, 44360, 44489, 44800, 44805, 44932, 45182, 45274, 45279, 45862, 45900, 46264, 46494, 46498, 46534, 46552, 46757, 46958, 46962, 47013, 47198, 47327, 47335, 47359, 47386, 47398, 47430, 47444, 47489, 47760, 47831, 48018, 48128, 48137, 48470, 48548, 48553, 48653, 48721, 48791, 48869, 49022, 49047, 49160, 49172, 49245, 49275, 49371, 49607, 49901, 49929, 49981, 49992, 50144, 50254, 50362, 50398, 50490, 50521, 50616, 50631, 50725, 50748, 50779, 50803, 50937, 51018, 51096, 51116, 51120, 51571, 51802, 51803, 51851, 51868, 51898, 51930, 52022, 52180, 52203, 52261, 52268, 52273, 52284, 52335, 52379, 52381, 52495, 52540, 52604, 52677, 53024, 53081, 53088, 53094, 53368, 53781, 53822, 53842, 53940, 53942, 54063, 54206, 54497, 54574, 54595, 54646, 54741, 54922, 54956, 55092, 55282, 55351, 55426, 55765, 55804, 55884, 55985, 55991, 56032, 56051, 56083, 56294, 56326, 56510, 56584, 56604, 56645, 56653, 56765, 56818, 56892, 56896, 57092, 57127, 57304, 57551, 57559, 57572, 57733, 57757, 57762, 57940, 57994, 58007, 58074, 58076, 58163, 58320, 58397, 58435, 58500, 58566, 58675, 58832, 59134, 59136, 59158, 59338, 59445, 59578, 59711, 59778, 60072, 60159, 60830, 61206, 61275, 61281, 61341, 61365, 61469, 61651, 61762, 61898, 62035, 62204, 62431, 62646, 62676, 62731, 62768, 62937, 62979, 63262, 63326, 63540, 63643, 63662, 63665, 63732, 63959, 64051, 64303, 64354, 64586, 64600, 64749, 64884, 65089, 65348, 65387, 65639, 65671, 65751, 65867, 66121, 66147, 66154, 66156, 66183, 66422, 66431, 66521, 66531, 66653, 66704, 66717, 66719, 66731, 66850, 67078, 67143, 67196, 67302, 67695, 67798, 67812, 67815, 67830, 67894, 68398, 68461, 68532, 68613, 68931, 68935, 69008, 69036, 69069, 69258, 69267, 69364, 69399, 69441, 69468, 69577, 69630, 69752, 69924, 69974, 69991, 70015, 70053, 70149, 70151, 70316, 70320, 70451, 70506, 70841, 70867, 70931, 70957, 71002, 71028, 71174, 71297, 71434, 71585, 71635, 71921, 72185, 72222, 72260, 72402, 72492, 72764, 72861, 72996, 73093, 73308, 73346, 73380, 73425, 73491, 73582, 73585, 73637, 73657, 73777, 73818, 73989, 73994, 74014, 74093, 74181, 74341, 74354, 74430, 74596, 74705, 75181, 75227, 75260, 75267, 75308, 75410, 75431, 75450, 75457, 75499, 75506, 75576, 75596, 75703, 76067, 76635, 76884, 76921, 76981, 77011, 77277, 77337, 77424, 77482, 77590, 77641, 77656, 77703, 77802, 77816, 77908, 78005, 78012, 78115, 78162, 78167, 78205, 78506, 78537, 78686, 79061, 79093, 79160, 79185, 79229, 79865, 79903, 79924, 80006, 80109, 80124, 80189, 80384, 80437, 80438, 80557, 80574, 80721, 80764, 80796, 80810, 80848, 80852, 80860, 80879, 81035, 81284, 81472, 81649, 81693, 81752, 81762, 81823, 81835, 81852, 81936, 81976, 82165, 82307, 82413, 82420, 82552, 82812, 82894, 82985, 83123, 83200, 83201, 83412, 83774, 83777, 83817, 83833, 83938, 83970, 84014, 84208, 84363, 84426, 84539, 84800, 84945, 84961, 85063, 85114, 85244, 85389, 85489, 85500, 85554, 85604, 85696, 85758, 85842, 85929, 86062, 86164, 86571, 86706, 86710, 86769, 86872, 86910, 87035, 87174, 87318, 87336, 87635, 87656, 87673, 87814, 87868, 87968, 88019, 88061, 88105, 88242, 88269, 88294, 88351, 88363, 88602, 88805, 88893, 89012, 89018, 89042, 89142, 89243, 89370, 89450, 89467, 89479, 89535, 89693, 89966, 90115, 90162, 90268, 90324, 90369, 90422, 90493, 90526, 90643, 90874, 90982, 91006, 91023, 91067, 91079, 91091, 91106, 91191, 91201, 91436, 91537, 91552, 91568, 91608, 91618, 91704, 91909, 91937, 92063, 92414, 92452, 92520, 92673, 92784, 92846, 92914, 93150, 93229, 93380, 93452, 93520, 93733, 93740, 93826, 93874, 93880, 93886, 93925, 93942, 93951, 93989, 94293, 94648, 94728, 94958, 95002, 95066, 95092, 95180, 95250, 95332, 95383, 95605, 95609, 95737, 96105, 96257, 96340, 96485, 96500, 96815, 96817, 96829, 96936, 96981, 96992, 97285, 97331, 97338, 97829, 97887, 97910, 98256, 98455, 98484, 98623, 98669, 98695, 98906, 99152, 99179, 99374, 99394, 99467, 99689, 99759};
    }
    static int[] descendingSortedData(){
        return new int[]{99759, 99689, 99467, 99394, 99374, 99179, 99152, 98906, 98695, 98669, 98623, 98484, 98455, 98256, 97910, 97887, 97829, 97338, 97331, 97285, 96992, 96981, 96936, 96829, 96817, 96815, 96500, 96485, 96340, 96257, 96105, 95737, 95609, 95605, 95383, 95332, 95250, 95180, 95092, 95066, 95002, 94958, 94728, 94648, 94293, 93989, 93951, 93942, 93925, 93886, 93880, 93874, 93826, 93740, 93733, 93520, 93452, 93380, 93229, 93150, 92914, 92846, 92784, 92673, 92520, 92452, 92414, 92063, 91937, 91909, 91704, 91618, 91608, 91568, 91552, 91537, 91436, 91201, 91191, 91106, 91091, 91079, 91067, 91023, 91006, 90982, 90874, 90643, 90526, 90493, 90422, 90369, 90324, 90268, 90162, 90115, 89966, 89693, 89535, 89479, 89467, 89450, 89370, 89243, 89142, 89042, 89018, 89012, 88893, 88805, 88602, 88363, 88351, 88294, 88269, 88242, 88105, 88061, 88019, 87968, 87868, 87814, 87673, 87656, 87635, 87336, 87318, 87174, 87035, 86910, 86872, 86769, 86710, 86706, 86571, 86164, 86062, 85929, 85842, 85758, 85696, 85604, 85554, 85500, 85489, 85389, 85244, 85114, 85063, 84961, 84945, 84800, 84539, 84426, 84363, 84208, 84014, 83970, 83938, 83833, 83817, 83777, 83774, 83412, 83201, 83200, 83123, 82985, 82894, 82812, 82552, 82420, 82413, 82307, 82165, 81976, 81936, 81852, 81835, 81823, 81762, 81752, 81693, 81649, 81472, 81284, 81035, 80879, 80860, 80852, 80848, 80810, 80796, 80764, 80721, 80574, 80557, 80438, 80437, 80384, 80189, 80124, 80109, 80006, 79924, 79903, 79865, 79229, 79185, 79160, 79093, 79061, 78686, 78537, 78506, 78205, 78167, 78162, 78115, 78012, 78005, 77908, 77816, 77802, 77703, 77656, 77641, 77590, 77482, 77424, 77337, 77277, 77011, 76981, 76921, 76884, 76635, 76067, 75703, 75596, 75576, 75506, 75499, 75457, 75450, 75431, 75410, 75308, 75267, 75260, 75227, 75181, 74705, 74596, 74430, 74354, 74341, 74181, 74093, 74014, 73994, 73989, 73818, 73777, 73657, 73637, 73585, 73582, 73491, 73425, 73380, 73346, 73308, 73093, 72996, 72861, 72764, 72492, 72402, 72260, 72222, 72185, 71921, 71635, 71585, 71434, 71297, 71174, 71028, 71002, 70957, 70931, 70867, 70841, 70506, 70451, 70320, 70316, 70151, 70149, 70053, 70015, 69991, 69974, 69924, 69752, 69630, 69577, 69468, 69441, 69399, 69364, 69267, 69258, 69069, 69036, 69008, 68935, 68931, 68613, 68532, 68461, 68398, 67894, 67830, 67815, 67812, 67798, 67695, 67302, 67196, 67143, 67078, 66850, 66731, 66719, 66717, 66704, 66653, 66531, 66521, 66431, 66422, 66183, 66156, 66154, 66147, 66121, 65867, 65751, 65671, 65639, 65387, 65348, 65089, 64884, 64749, 64600, 64586, 64354, 64303, 64051, 63959, 63732, 63665, 63662, 63643, 63540, 63326, 63262, 62979, 62937, 62768, 62731, 62676, 62646, 62431, 62204, 62035, 61898, 61762, 61651, 61469, 61365, 61341, 61281, 61275, 61206, 60830, 60159, 60072, 59778, 59711, 59578, 59445, 59338, 59158, 59136, 59134, 58832, 58675, 58566, 58500, 58435, 58397, 58320, 58163, 58076, 58074, 58007, 57994, 57940, 57762, 57757, 57733, 57572, 57559, 57551, 57304, 57127, 57092, 56896, 56892, 56818, 56765, 56653, 56645, 56604, 56584, 56510, 56326, 56294, 56083, 56051, 56032, 55991, 55985, 55884, 55804, 55765, 55426, 55351, 55282, 55092, 54956, 54922, 54741, 54646, 54595, 54574, 54497, 54206, 54063, 53942, 53940, 53842, 53822, 53781, 53368, 53094, 53088, 53081, 53024, 52677, 52604, 52540, 52495, 52381, 52379, 52335, 52284, 52273, 52268, 52261, 52203, 52180, 52022, 51930, 51898, 51868, 51851, 51803, 51802, 51571, 51120, 51116, 51096, 51018, 50937, 50803, 50779, 50748, 50725, 50631, 50616, 50521, 50490, 50398, 50362, 50254, 50144, 49992, 49981, 49929, 49901, 49607, 49371, 49275, 49245, 49172, 49160, 49047, 49022, 48869, 48791, 48721, 48653, 48553, 48548, 48470, 48137, 48128, 48018, 47831, 47760, 47489, 47444, 47430, 47398, 47386, 47359, 47335, 47327, 47198, 47013, 46962, 46958, 46757, 46552, 46534, 46498, 46494, 46264, 45900, 45862, 45279, 45274, 45182, 44932, 44805, 44800, 44489, 44360, 44284, 44267, 44215, 44191, 44073, 43752, 43682, 43652, 43618, 43531, 43417, 43377, 43170, 43088, 43014, 42944, 42918, 42797, 42690, 42675, 42663, 42579, 42574, 42478, 42422, 42039, 41944, 41865, 41863, 41770, 41721, 41276, 41125, 41122, 40997, 40993, 40745, 40721, 40701, 40672, 40660, 40511, 40504, 40364, 40346, 40300, 40184, 40164, 40114, 39904, 39736, 39652, 39629, 39449, 39345, 39300, 39192, 39030, 38861, 38751, 38702, 38664, 38654, 38618, 38607, 38520, 38261, 38259, 38068, 38060, 37930, 37871, 37723, 37658, 37639, 37491, 37443, 37428, 37345, 37271, 37201, 37146, 37093, 37068, 37052, 37016, 36904, 36819, 36786, 36758, 36718, 36688, 36684, 36662, 36399, 36382, 36280, 36254, 36080, 35935, 35861, 35802, 35777, 35646, 35582, 35431, 35423, 35384, 35375, 35173, 35114, 35085, 35068, 34780, 34622, 34235, 34163, 34056, 33996, 33453, 33326, 33246, 33142, 33098, 32930, 32872, 32864, 32857, 32706, 32632, 32519, 32503, 32485, 32473, 32271, 32234, 32222, 32211, 31924, 31913, 31884, 31785, 31622, 31161, 31160, 31119, 31079, 30942, 30790, 30709, 30701, 30690, 30674, 30660, 30540, 30485, 30463, 30426, 30313, 30197, 29928, 29718, 29674, 29415, 29360, 29166, 29149, 29115, 28901, 28844, 28517, 28347, 28267, 28055, 27818, 27790, 27652, 27605, 27573, 27572, 27524, 27493, 27441, 27409, 27133, 26863, 26649, 26505, 26449, 26434, 26405, 26348, 26302, 26296, 26275, 26038, 25917, 25850, 25844, 25828, 25549, 25308, 25274, 25150, 25102, 25065, 25064, 24838, 24704, 24569, 24456, 24440, 24116, 24078, 23749, 23668, 23570, 23536, 23391, 23331, 23183, 23126, 23049, 23044, 23008, 22885, 22883, 22826, 22748, 22728, 22692, 22666, 22580, 22549, 22471, 22404, 22335, 22275, 22209, 22163, 22145, 22092, 21948, 21803, 21800, 21758, 21499, 21492, 21464, 21268, 21042, 20867, 20809, 20787, 20691, 20676, 20203, 19947, 19916, 19860, 19780, 19308, 19251, 19223, 19073, 18976, 18759, 18710, 18574, 18547, 18546, 18521, 18465, 18302, 18293, 18233, 18124, 18106, 18081, 18066, 18017, 17894, 17594, 17546, 17421, 17373, 17220, 17201, 17077, 16992, 16890, 16855, 16766, 16761, 16545, 16473, 16465, 16270, 16269, 16144, 16130, 16100, 16056, 16016, 15909, 15890, 15723, 15677, 15561, 15535, 15438, 15028, 14897, 14870, 14697, 14391, 14288, 14284, 14132, 13964, 13941, 13894, 13781, 13766, 13660, 13651, 13516, 13013, 12909, 12889, 12834, 12790, 12773, 12739, 12646, 12498, 12444, 12401, 12329, 12236, 12190, 12159, 11943, 11856, 11756, 11675, 11653, 11551, 11535, 11531, 11406, 11172, 11063, 11044, 11040, 10795, 10782, 10455, 10430, 10033, 9840, 9741, 9640, 9508, 9388, 9139, 9022, 8927, 8862, 8797, 8103, 8001, 7807, 7789, 7745, 7621, 7561, 7491, 7479, 7470, 7398, 7383, 7325, 7220, 7196, 7178, 7053, 7039, 6918, 6914, 6815, 6679, 6644, 6532, 6363, 6279, 5756, 5754, 5567, 5475, 5437, 5316, 5228, 5141, 5124, 5059, 4607, 4535, 4505, 4407, 4262, 4211, 4115, 4010, 3901, 3821, 3696, 3613, 3573, 3454, 3370, 3100, 2968, 2822, 2361, 2172, 2171, 2116, 2048, 2016, 1919, 1849, 1763, 1595, 1576, 1214, 955, 897, 840, 814, 751, 657, 551, 381, 265, 138, 25};
    }
    static int[] unsorted10Data(){
        return new int[]{57420, 87677, 5143, 2212, 30145, 19051, 64445, 87784, 16380, 16848, 70944, 25943, 42989, 32266, 79755, 62876, 42920, 40440, 38146, 94689, 36361, 7081, 28601, 48258, 6867, 70691, 17490, 87219, 74517, 42717, 98447, 43556, 49874, 21294, 45050, 74546, 58813, 41027, 40466, 57514, 95469, 16608, 43225, 84844, 47698, 1026, 57533, 97873, 52772, 88895, 39611, 53330, 68801, 83202, 78666, 98067, 74734, 71279, 22351, 35044, 60985, 17174, 60216, 79768, 943, 80837, 75085, 18873, 73175, 6970, 14896, 73328, 88630, 98936, 25181, 56335, 92127, 83385, 7606, 77893, 26796, 31443, 69923, 17155, 20957, 28766, 33875, 54175, 17722, 85122, 62314, 29784, 36705, 67491, 494, 41477, 76101, 11171, 52831, 36533};
    }
    static int[] ascendingSorted10Data(){
        return new int[]{494, 943, 1026, 2212, 5143, 6867, 6970, 7081, 7606, 11171, 14896, 16380, 16608, 16848, 17155, 17174, 17490, 17722, 18873, 19051, 20957, 21294, 22351, 25181, 25943, 26796, 28601, 28766, 29784, 30145, 31443, 32266, 33875, 35044, 36361, 36533, 36705, 38146, 39611, 40440, 40466, 41027, 41477, 42717, 42920, 42989, 43225, 43556, 45050, 47698, 48258, 49874, 52772, 52831, 53330, 54175, 56335, 57420, 57514, 57533, 58813, 60216, 60985, 62314, 62876, 64445, 67491, 68801, 69923, 70691, 70944, 71279, 73175, 73328, 74517, 74546, 74734, 75085, 76101, 77893, 78666, 79755, 79768, 80837, 83202, 83385, 84844, 85122, 87219, 87677, 87784, 88630, 88895, 92127, 94689, 95469, 97873, 98067, 98447, 98936};
    }
    static int[] descendingSorted10Data(){
        return new int[]{98936, 98447, 98067, 97873, 95469, 94689, 92127, 88895, 88630, 87784, 87677, 87219, 85122, 84844, 83385, 83202, 80837, 79768, 79755, 78666, 77893, 76101, 75085, 74734, 74546, 74517, 73328, 73175, 71279, 70944, 70691, 69923, 68801, 67491, 64445, 62876, 62314, 60985, 60216, 58813, 57533, 57514, 57420, 56335, 54175, 53330, 52831, 52772, 49874, 48258, 47698, 45050, 43556, 43225, 42989, 42920, 42717, 41477, 41027, 40466, 40440, 39611, 38146, 36705, 36533, 36361, 35044, 33875, 32266, 31443, 30145, 29784, 28766, 28601, 26796, 25943, 25181, 22351, 21294, 20957, 19051, 18873, 17722, 17490, 17174, 17155, 16848, 16608, 16380, 14896, 11171, 7606, 7081, 6970, 6867, 5143, 2212, 1026, 943, 494};
    }
    static ArrayList<Data> unsortedArrayList(){
        return new ArrayList();
    }
}
