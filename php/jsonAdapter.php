<?php
	class jsonAdapter extends Element {
		function __construct($newId, $newType, $newValue) {
			parent::__construct($newId, $newType, $newValue);
		}
		
		public function printElement(){
			echo '{ "'.$this->type.'": { "id": "'.$this->id.'", "value": "'.$this->value.'"}}'."\n";
		}
	}
?>
