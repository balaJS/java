$(document).ready(function() {
	$htmls = $('.included');
	$htmls.each(function(i, html) {
		$html = $(html);
		$html.load($html.attr('data-file'));
	});
});
