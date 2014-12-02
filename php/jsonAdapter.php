<?php
	class jsonAdapter extends Element {
		function __construct($newId, $newType, $newValue) {
			parent::__construct($newId, $newType, $newValue);
		}
		
		public function printElement(){
			echo '{'."\n"
				."\t".'"'.$this->type.'": {'."\n"
				."\t\t".'"id": "'.$this->id.'",'."\n"
				."\t\t".'"value": "'.$this->value.'"'."\n"
				."\t".'}'."\n"
				.'}'."\n";
		}
	}
?>
