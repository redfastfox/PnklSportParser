package pnklsportparser

    
class LineParsingJob {
    
    ParserService parserService


    static triggers = {
        cron name: 'Trigger', startDelay: 10000, cronExpression: '0 27 15 ? * *'
    }
    def execute() {
      println "Run LineParsingJob!"
      parserService.saveFixtures() 
      println Fixture.findAll().size()
      parserService.saveSoccerOdds() 
      println SoccerOdd.findAll().size()
      
        
     


    }

}

