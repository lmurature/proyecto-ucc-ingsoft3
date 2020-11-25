Feature('vote');

Scenario('test voting app vote view', ({ I }) => {
    I.amOnPage('http://159.203.190.97:5000/');
    I.see('BEARS');
    I.see('DOGS');
    I.see('Bears vs Dogs!')
    I.see('(Tip: you can change your vote)');
});
