SCRIPT_START
{
NOP
LVAR_INT  player yakuza_char yakuza_char2 weap_yakuza weap_yakuza2 // Player and Yakuzas
LVAR_INT  yardie_char yardie_char2 weap_yardie weap_yardie2 // Yardies
LVAR_INT  colombian_char colombian_char2 weap_colombian weap_colombian2 // Colombians
LVAR_FLOAT x y z // Positions
 
y = 0.0
 
GET_PLAYER_CHAR 0 player

yakuzaGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_Y
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Yakuza Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 1.0
   REQUEST_MODEL PED_GANG_YAKUZA_A
   REQUEST_MODEL PED_GANG_YAKUZA_B
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 10 PED_GANG_YAKUZA_A x y z yakuza_char
   CREATE_CHAR 10 PED_GANG_YAKUZA_B x y z yakuza_char2
   GIVE_WEAPON_TO_CHAR yakuza_char weap_yakuza 1000
   GIVE_WEAPON_TO_CHAR yakuza_char2 weap_yakuza2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Yakuza" weap_yakuza
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Yakuza 2" weap_yakuza2
   MARK_CHAR_AS_NO_LONGER_NEEDED yakuza_char
   MARK_CHAR_AS_NO_LONGER_NEEDED yakuza_char2
ENDIF

yardiesGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_Y
 AND IS_KEY_PRESSED VK_KEY_2
   PRINT_HELP_STRING "Yardies Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL PED_GANG_YARDIE_A
   REQUEST_MODEL PED_GANG_YARDIE_B
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 11 PED_GANG_YARDIE_A x y z yardie_char
   CREATE_CHAR 11 PED_GANG_YARDIE_B x y z yardie_char2
   MARK_CHAR_AS_NO_LONGER_NEEDED yardie_char
   MARK_CHAR_AS_NO_LONGER_NEEDED yardie_char2
   GIVE_WEAPON_TO_CHAR yardie_char weap_yardie 1000
   GIVE_WEAPON_TO_CHAR yardie_char2 weap_yardie2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Yardie" weap_yardie
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Yardie 2" weap_yardie2
   MARK_CHAR_AS_NO_LONGER_NEEDED yardie_char
   MARK_CHAR_AS_NO_LONGER_NEEDED yardie_char2
ENDIF

colombianGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_C
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Colombian Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL PED_GANG_COLOMBIAN_A
   REQUEST_MODEL PED_GANG_COLOMBIAN_B
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 12 PED_GANG_COLOMBIAN_A x y z colombian_char
   CREATE_CHAR 12 PED_GANG_COLOMBIAN_B x y z colombian_char2
   MARK_CHAR_AS_NO_LONGER_NEEDED colombian_char
   MARK_CHAR_AS_NO_LONGER_NEEDED colombian_char2
   GIVE_WEAPON_TO_CHAR colombian_char weap_colombian 1000
   GIVE_WEAPON_TO_CHAR colombian_char2 weap_colombian2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Colombian" weap_colombian
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Colombian 2" weap_colombian2
   MARK_CHAR_AS_NO_LONGER_NEEDED colombian_char
   MARK_CHAR_AS_NO_LONGER_NEEDED colombian_char2
ENDIF
GOTO yakuzaGang


}
SCRIPT_END