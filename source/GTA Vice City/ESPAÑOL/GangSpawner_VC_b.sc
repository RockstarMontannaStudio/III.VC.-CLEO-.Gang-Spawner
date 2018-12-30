SCRIPT_START
{
NOP
LVAR_INT  player diazg_char diazg_char2 weap_diazg weap_diazg2 // Player and Diaz's gang
LVAR_INT  biker_char biker_char2 weap_biker weap_biker2 // Bikers
LVAR_INT  playerg_char playerg_char2 weap_playerg weap_playerg2 // Vercetti's gang
LVAR_FLOAT x y z // Positions
 
y = 0.0
 
GET_PLAYER_CHAR 0 player

diazGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_D
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Banda de Diaz"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL CLA
   REQUEST_MODEL CLB
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 10 CLA x y z diazg_char
   CREATE_CHAR 10 CLB x y z diazg_char2
   GIVE_WEAPON_TO_CHAR diazg_char weap_diazg 1000
   GIVE_WEAPON_TO_CHAR diazg_char2 weap_diazg2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Armas" "Pandillero de Diaz" weap_diazg
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Armas" "Pandillero de Diaz 2" weap_diazg2
   MARK_CHAR_AS_NO_LONGER_NEEDED diazg_char
   MARK_CHAR_AS_NO_LONGER_NEEDED diazg_char2
ENDIF

bikersGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_M
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Banda de Moteros"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL BKA
   REQUEST_MODEL BKB
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 12 BKA x y z biker_char
   CREATE_CHAR 12 BKB x y z biker_char2
   GIVE_WEAPON_TO_CHAR biker_char weap_biker 1000
   GIVE_WEAPON_TO_CHAR biker_char2 weap_biker2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Armas" "Motero" weap_biker
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Armas" "Motero 2" weap_biker2
   MARK_CHAR_AS_NO_LONGER_NEEDED biker_char
   MARK_CHAR_AS_NO_LONGER_NEEDED biker_char2
ENDIF

tommyGang:
WAIT 0

 IF IS_KEY_PRESSED VK_KEY_T
 AND IS_KEY_PRESSED VK_KEY_1
   PRINT_HELP_STRING "Banda de Tommy Vercetti"
   GET_PLAYER_COORDINATES 0 x y z
   y += 2.0
   REQUEST_MODEL PGA
   REQUEST_MODEL PGB
   LOAD_ALL_MODELS_NOW 
   CREATE_CHAR 13 PGA x y z playerg_char
   CREATE_CHAR 13 PGB x y z playerg_char2
   GIVE_WEAPON_TO_CHAR playerg_char weap_playerg 1000
   GIVE_WEAPON_TO_CHAR playerg_char2 weap_playerg2 1000
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Armas" "Pandillero de Tommy" weap_playerg
   READ_INT_FROM_INI_FILE "CLEO\GangSpawner_VC.ini" "Armas" "Pandillero de Tommy 2" weap_playerg2
   MARK_CHAR_AS_NO_LONGER_NEEDED playerg_char
   MARK_CHAR_AS_NO_LONGER_NEEDED playerg_char2
ENDIF
GOTO diazGang


}
SCRIPT_END