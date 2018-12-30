SCRIPT_START
{
NOP
LVAR_INT  player cuban_char cuban_char2 weap_cuban weap_cuban2 // Player and Cubans
LVAR_INT  haitian_char haitian_char2 weap_haitian weap_haitian2 // Haitians
LVAR_INT  shark_char shark_char2 weap_shark weap_shark2 // Sharks
LVAR_FLOAT x y z // Positions
 
y = 0.0
 
GET_PLAYER_CHAR 0 player

cubanGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_C
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Cuban Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL CBA
   REQUEST_MODEL CBB
   CREATE_CHAR 7 CBA x y z cuban_char
   CREATE_CHAR 7 CBB x y z cuban_char2
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Weapons" "Cuban" weap_cuban
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Weapons" "Cuban 2" weap_cuban2
   GIVE_WEAPON_TO_CHAR cuban_char weap_cuban 1000
   GIVE_WEAPON_TO_CHAR cuban_char2 weap_cuban2 1000
   MARK_CHAR_AS_NO_LONGER_NEEDED cuban_char
   MARK_CHAR_AS_NO_LONGER_NEEDED cuban_char2
   LOAD_ALL_MODELS_NOW 
ENDIF

haitianGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_H
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Haitian Gang"
   REQUEST_MODEL HNA
   REQUEST_MODEL HNB
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 8 HNA x y z haitian_char
   CREATE_CHAR 8 HNB x y z haitian_char2
   MARK_CHAR_AS_NO_LONGER_NEEDED haitian_char
   MARK_CHAR_AS_NO_LONGER_NEEDED haitian_char2
   GIVE_WEAPON_TO_CHAR haitian_char weap_haitian 1000
   GIVE_WEAPON_TO_CHAR haitian_char2 weap_haitian2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Weapons" "Haitian" weap_haitian
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Weapons" "Haitian 2" weap_haitian2
   MARK_CHAR_AS_NO_LONGER_NEEDED haitian_char
   MARK_CHAR_AS_NO_LONGER_NEEDED haitian_char2
ENDIF

sharksGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_S
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Sharks Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL SGA
   REQUEST_MODEL SGB
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 9 SGA x y z shark_char
   CREATE_CHAR 9 SGB x y z shark_char2
   MARK_CHAR_AS_NO_LONGER_NEEDED shark_char
   MARK_CHAR_AS_NO_LONGER_NEEDED shark_char2
   GIVE_WEAPON_TO_CHAR shark_char weap_shark 1000
   GIVE_WEAPON_TO_CHAR shark_char2 weap_shark2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Weapons" "Shark" weap_shark
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Weapons" "Shark 2" weap_shark2
   MARK_CHAR_AS_NO_LONGER_NEEDED shark_char
   MARK_CHAR_AS_NO_LONGER_NEEDED shark_char2
ENDIF
GOTO cubanGang


}
SCRIPT_END