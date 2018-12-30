SCRIPT_START
{
NOP
LVAR_INT  player leone_char leone_char2 weap_leone weap_leone2 // Player and Leones
LVAR_INT  triada_char triada_char2 weap_triada weap_triada2 // Triads
LVAR_INT  diablo_char diablo_char2 weap_diablo weap_diablo2 // Diablos
LVAR_FLOAT x y z // Positions 
 
y = 0.0
 
GET_PLAYER_CHAR 0 player

leoneGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_L
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Leone's Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL PED_GANG_MAFIA_A
   REQUEST_MODEL PED_GANG_MAFIA_B
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 7 PED_GANG_MAFIA_A x y z leone_char
   CREATE_CHAR 7 PED_GANG_MAFIA_B x y z leone_char2
   GIVE_WEAPON_TO_CHAR leone_char weap_leone 1000
   GIVE_WEAPON_TO_CHAR leone_char2 weap_leone2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Leone" weap_leone
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Leone 2" weap_leone2
   MARK_CHAR_AS_NO_LONGER_NEEDED leone_char
   MARK_CHAR_AS_NO_LONGER_NEEDED leone_char2
ENDIF

triadGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_T
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Triad Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL PED_GANG_TRIAD_A
   REQUEST_MODEL PED_GANG_TRIAD_B
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 8 PED_GANG_TRIAD_A x y z triada_char
   CREATE_CHAR 8 PED_GANG_TRIAD_B x y z triada_char2
   MARK_CHAR_AS_NO_LONGER_NEEDED triada_char
   MARK_CHAR_AS_NO_LONGER_NEEDED triada_char2
   GIVE_WEAPON_TO_CHAR triada_char weap_triada 1000
   GIVE_WEAPON_TO_CHAR triada_char2 weap_triada2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Triad" weap_triada
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Triad 2" weap_triada2
   MARK_CHAR_AS_NO_LONGER_NEEDED triada_char
   MARK_CHAR_AS_NO_LONGER_NEEDED triada_char2
ENDIF

diabloGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_D
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Diablos Gang"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL PED_GANG_DIABLO_A
   REQUEST_MODEL PED_GANG_DIABLO_B
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 9 PED_GANG_DIABLO_A x y z diablo_char
   CREATE_CHAR 9 PED_GANG_DIABLO_B x y z diablo_char2
   MARK_CHAR_AS_NO_LONGER_NEEDED diablo_char
   MARK_CHAR_AS_NO_LONGER_NEEDED diablo_char2
   GIVE_WEAPON_TO_CHAR diablo_char weap_diablo 1000
   GIVE_WEAPON_TO_CHAR diablo_char2 weap_diablo2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Diablo" weap_diablo
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_III.ini" "Weapons" "Diablo 2" weap_diablo2
   MARK_CHAR_AS_NO_LONGER_NEEDED diablo_char
   MARK_CHAR_AS_NO_LONGER_NEEDED diablo_char2
ENDIF
GOTO leoneGang 


}
SCRIPT_END
