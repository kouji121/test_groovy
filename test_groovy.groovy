@RestController
class App{
	@RequestMapping("/")
	def home(){
		def header = "<html>hello!<body>"
		def footer = "</bodyl>hello!</html>"
		def content = "<h1>hello!</h1>"
		
		header + content + footer
	}
}