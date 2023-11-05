<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	 <html>
    <head>
      <title>Liste des comptes </title>
      </head>
      </html>
		<table border="1">
        <tr>
            <th>Code</th>
            <th>Solde</th>
            <th>Date de Création</th>
        </tr>
        <xsl:for-each select="BanqueService/getComptes">
            <tr>
                <td><xsl:value-of select="code"/></td>
                <td><xsl:value-of select="solde"/></td>
                <td><xsl:value-of select="dateCreation"/></td>
            </tr>
        </xsl:for-each>
    </table>
	</xsl:template>
</xsl:stylesheet>