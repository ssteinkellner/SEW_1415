<?php
	class Factory {
		private $adapterType='';
		
		function __construct($adapterType) {
			$this->adapterType = $adapterType;
		}
		
		function createElement($id, $type, $value){
			include_once('./Element.php');
			switch($this->adapterType){
				case 'json':
					include_once('./jsonAdapter.php');
					return new jsonAdapter($id, $type, $value);
				case 'yaml':
					include_once('./yamlAdapter.php');
					return new yamlAdapter($id, $type, $value);
				case 'php':
					include_once('./phpAdapter.php');
					return new phpAdapter($id, $type, $value);
				case 'xml':
					include_once('./xmlAdapter.php');
					return new xmlAdapter($id, $type, $value);
				default:
					return null;
			}
		}
		
		static function getAdapterTypes(){
			return array('json','yaml','php','xml');
		}
	}
?>
