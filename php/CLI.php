<?php
	class CLI {
		public function read(){
			return trim(fgets(STDIN));
		}
		
		public function action($line){
			$input = explode(' ',$line);
			if(count($input)<=0){ return; }
			switch($input[0]){
				case 'create':
					if(count($input)<=4){
						echo 'Usage: create <adaptertype> <id> <type> <value>'."\n";
						return;
					}
					
					$factory = getFactory($input[1]);
					$element = $factory->createElement($input[2],$input[3],$input[4]);
					if($element===null){
						echo 'Element wasn\'t created!';
					}else{
						echo $element->getString();
					}
					break;
				case 'database':
					if(count($input)<=2){
						echo 'Usage: database <adaptertype> <query>'."\n";
						return;
					}
					
					$input = array_slice($input, 2);
					echo 'inputted Query: '.implode($input,' ')."\n";
					
/*					global $link;
					if($link){
						$res = mysqli_query($link, $query);
						if (!$res) {
							$err .= 'MySQL Error: ' . mysqli_error($link) . "<br>\n";
						}else if(mysqli_num_rows($res)>0){
							$row = mysqli_fetch_assoc($res);
						}
					}else{
						echo 'something went wrong!';
					}*/
					
					break;
				case 'help':
					echo '- - - [Help Menu] - - -'."\n"
						.'Commands:'."\n"
						.'- create'."\n"
						."\t".'creates a new element and prints it'."\n"
						."\t".'Arguments:'."\n"
						."\t".'- adaptertype: type of the adapter'."\n"
						."\t".'- id: id of the element'."\n"
						."\t".'- type: type of the element'."\n"
						."\t".'- value: value of the element'."\n"
						.'- database'."\n"
						."\t".'loads an element from the database and prints it'."\n"
						."\t".'Arguments:'."\n"
						."\t".'- adaptertype: type of the adapter'."\n"
						."\t".'- query: query to load element from Database'."\n"
						."\t".'HINT: only the first element, that is returned'."\n"
						."\t".'from the database will be created and printed!'."\n"
						.'- help'."\n"
						."\t".'shows this dialog'."\n"
						.'- exit'."\n"
						."\t".'stops the programm'."\n"
						.''."\n"
						.'Possible Adaptertypes: '.implode(Factory::getAdapterTypes(),', ')."\n";
					break;
			}
		}
		
		private function getFactory($name){
			global $factorys;
			if($factorys===null){
				$factorys = array();
			}
			if(!in_array($name,$factorys)){
				$factorys[$name] = new Factory($name);
			}
//			var_dump($factorys);
			return $factorys[$name];
		}
	}
?>
