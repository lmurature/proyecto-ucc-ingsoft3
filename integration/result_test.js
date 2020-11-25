Feature('result');

Scenario('test voting app result view', ({ I }) => {
    I.amOnPage('http://159.203.190.97:5001/');
    I.see('BEARS');
    I.see('DOGS');
});
